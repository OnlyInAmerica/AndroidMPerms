#AndroidMPerms

![Screenshot](https://raw.github.com/OnlyInAmerica/AndroidMPerms/master/art/screenshot.png)

Android M introduces runtime permissions, which are great. As a part of these changes permissions deemed less dangerous have been excluded from runtime enforcement and are instead automatically granted at install time.

Two of the grant-at-install-time permissions are [`GET_ACCOUNTS`](http://developer.android.com/reference/android/Manifest.permission.html#GET_ACCOUNTS) and [`INTERNET`](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) which, when combined, let an app read your account identifiers and transmit them over the Internet* without any such prompts.

I think this is bad.

*This app doesn't transmit anything but it is granted the `INTERNET` for demonstration.

## Contributions

Please open pull requests with other issues you find with Android M permissions.
