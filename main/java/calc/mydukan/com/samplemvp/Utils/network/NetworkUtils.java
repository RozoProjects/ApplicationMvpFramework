package calc.mydukan.com.samplemvp.Utils.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by rojesharunkumar on 22/10/17.
 */

// Final class , network utils cannot be extended for modification
public final class NetworkUtils {

    private NetworkUtils() {
        // Private constructor , cannot be instantiable publicly
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

}
