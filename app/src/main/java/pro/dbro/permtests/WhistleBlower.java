package pro.dbro.permtests;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;
import android.util.Patterns;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * Created by davidbrodsky on 7/9/15.
 */
public class WhistleBlower {

    public static String getAccountIdentifiers(Context context) {
        StringBuilder accountIdentifiers = new StringBuilder();
        Account[] accounts = AccountManager.get(context).getAccounts();
        for (Account account : accounts) {

            accountIdentifiers.append(friendlyNameForAccountType(account.type));
            accountIdentifiers.append(" : ");
            accountIdentifiers.append(account.name);
            accountIdentifiers.append('\n');
        }
        return accountIdentifiers.toString();
    }

    private static String friendlyNameForAccountType(final String accountType) {
        switch(accountType) {
            case "com.google":
                return "Google";

            case "com.facebook.auth.login":
                return "Facebook";

            case "com.twitter.android.auth.login":
                return "Twitter";

            default:
                return accountType;
        }
    }
}
