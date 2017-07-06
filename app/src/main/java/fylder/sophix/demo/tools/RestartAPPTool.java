package fylder.sophix.demo.tools;

import android.content.Context;
import android.content.Intent;

/**
 * Created by fylder on 2017/7/5.
 */

public class RestartAPPTool {

    public static void restartAPP(Context context, long Delayed) {


        Intent intent1 = new Intent(context, killSelfService.class);
        intent1.putExtra("PackageName", context.getPackageName());
        intent1.putExtra("Delayed", Delayed);
        context.startService(intent1);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    public static void restartAPP(Context context) {
        restartAPP(context, 2000);
    }
}
