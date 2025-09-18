package defpackage;

import android.app.DownloadManager;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;

/* renamed from: wL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7775wL0 implements Handler.Callback {
    public final /* synthetic */ RunnableC8155yL0 a;

    public C7775wL0(RunnableC8155yL0 runnableC8155yL0) {
        this.a = runnableC8155yL0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1314) {
            long j = message.getData().getLong("downloadManagerId");
            RunnableC8155yL0 runnableC8155yL0 = this.a;
            if (j == runnableC8155yL0.j) {
                DownloadManager downloadManager = (DownloadManager) C7394uL0.b.getApplicationContext().getSystemService("download");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(runnableC8155yL0.j);
                Cursor cursorQuery = downloadManager.query(query);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    long j2 = cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far"));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                    cursorQuery.close();
                    String str = runnableC8155yL0.b;
                    HashMap map = RunnableC8155yL0.y;
                    C7585vL0 c7585vL0 = !map.containsKey(str) ? null : (C7585vL0) map.get(str);
                    float f = j3 > 0 ? j2 / j3 : 0.0f;
                    if (c7585vL0 != null && c7585vL0.a(f)) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("taskId", String.valueOf(runnableC8155yL0.b));
                        writableMapCreateMap.putString("written", String.valueOf(j2));
                        writableMapCreateMap.putString("total", String.valueOf(j3));
                        writableMapCreateMap.putString("chunk", "");
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C7394uL0.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
                    }
                    if (j3 == j2) {
                        runnableC8155yL0.u.cancel(true);
                    }
                }
            }
        }
        return true;
    }
}
