email='abc@gmail.com'
password='abc'
if email=='abc@gmail.com' and password=='abc':
    print("User logged in")
elif email=='abc@gmail.com':
    print("incorrect password")
elif password=='abc':
    print("incorrect email")
else:
    print("Both wrong")
