jQuery(function($) {
	attachRegistrationHandlers();
});

function attachRegistrationHandlers() {
	var username = $('#register-username'), email = $('#register-email'), password = $('#register-password'), cPassword = $('#confirm-register-password'), allFields = $(
			[]).add(username).add(email).add(password).add(cPassword);

	$('#dialog-form').dialog(
			{
				autoOpen : false,
				height : 550,
				width : 450,
				modal : true,
				buttons : {
					'Create an account' : function() {
						allFields.removeClass('ui-state-error');

						if (checkLength(username, 'register-username',
								MIN_USERNAME_LENGTH, MAX_USERNAME_LENGTH)
								&& checkLength(email, 'register-email',
										MIN_EMAIL_LENGTH, MAX_EMAIL_LENGTH)
								&& checkLength(password, 'register-password',
										MIN_PASSWORD_LENGTH,
										MAX_PASSWORD_LENGTH)
								&& checkRegexp(username, SAFE_USERNAME_REGEX,
										SAFE_USERNAME_MESSAGE)
								&& checkRegexp(email, SAFE_EMAIL_REGEX,
										SAFE_EMAIL_MESSAGE)
								&& checkRegexp(password, SAFE_PASSWORD_REGEX,
										SAFE_PASSWORD_MESSAGE)
								&& checkPasswordsEqual(password, cPassword,
										'Passwords do not match.')
								&& !isDuplicateUsername(username,
										'Account name already taken')) { // Short-circuitry
							createNewAccount();
							$(this).dialog('close');
						}
					},
					Cancel : function() {
						$(this).dialog('close');
					}
				},
				close : function() {
					allFields.val('').change().removeClass('ui-state-error');
					$('.validateTips').text('All form fields are required.')
							.change();
				}
			});

	$('#create-user')
	// .button() // Don't do this; keep it a link
	.click(function() {
		$('#dialog-form').dialog('open');
	});
}

// Perform an isDuplicateUsername request.
function isDuplicateUsername(o, n) {
	var retval = true; // Guilty until proven innocent.
	var requestData = '{' + '"command" : "isDuplicateUsername",'
			+ '"arguments" : {' + '"username" : "' + o.val() + '"' + '}' + '}';
	makeSynchronousPostRequest(requestData, function(responseData) {
		if (responseData.isDuplicateUsername === true) {
			o.addClass('ui-state-error');
			updateTips(n);
			retval = true;
		} else {
			retval = false;
		}
	}, null); // Defined in "/olive/scripts/master.js".

	return retval;
}

// Perform a createNewAccount request
function createNewAccount() {
	var requestData = '{' + '"command" : "createAccount",' + '"arguments" : {'
			+ '"username" : "' + $('#register-username').val() + '",'
			+ '"email" : "' + $('#register-email').val() + '",'
			+ '"password" : "' + $('#register-password').val() + '",'
			+ '"confirmPassword" : "' + $('#confirm-register-password').val()
			+ '"' + '}' + '}';
	makeAsynchronousPostRequest(requestData, redirect('projects.jsp'), null); // Defined
																				// in
																				// "/olive/scripts/master.js".
}