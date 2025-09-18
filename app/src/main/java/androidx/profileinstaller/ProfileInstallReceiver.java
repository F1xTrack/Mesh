package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import p000.AbstractC9210eB1;
import p000.CO1;
import p000.ExecutorC4160h8;
import p000.QQ0;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC9210eB1.m17877d(context, new ExecutorC4160h8(2), new QQ0(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        AbstractC9210eB1.m17876c(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        setResultCode(10);
                        return;
                    } catch (PackageManager.NameNotFoundException unused) {
                        setResultCode(7);
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            if (Build.VERSION.SDK_INT < 24) {
                setResultCode(13);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                setResultCode(12);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
            setResultCode(16);
            return;
        }
        if (CO1.m1179a(Build.VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : context.getCodeCacheDir())) {
            setResultCode(14);
        } else {
            setResultCode(15);
        }
    }
}
