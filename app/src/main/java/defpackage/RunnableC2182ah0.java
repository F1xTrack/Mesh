package defpackage;

import android.os.StatFs;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.rn.push.constants.ResultCode;
import java.io.File;

/* renamed from: ah0 */
/* loaded from: classes.dex */
public final class RunnableC2182ah0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Callback b;

    public /* synthetic */ RunnableC2182ah0(int i, Callback callback) {
        this.a = i;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Callback callback = this.b;
        switch (this.a) {
            case 0:
                callback.invoke(Boolean.TRUE);
                break;
            default:
                ReactApplicationContext reactApplicationContext = C7394uL0.b;
                StatFs statFs = new StatFs(reactApplicationContext.getFilesDir().getPath());
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
                writableMapCreateMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
                File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                    writableMapCreateMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
                    writableMapCreateMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
                } else {
                    writableMapCreateMap.putString("external_free", ResultCode.ERROR);
                    writableMapCreateMap.putString("external_total", ResultCode.ERROR);
                }
                callback.invoke(null, writableMapCreateMap);
                break;
        }
    }
}
