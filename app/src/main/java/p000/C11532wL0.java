package p000;

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
public final class C11532wL0 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ RunnableC11786yL0 f44829a;

    public C11532wL0(RunnableC11786yL0 runnableC11786yL0) {
        this.f44829a = runnableC11786yL0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1314) {
            long j = message.getData().getLong("downloadManagerId");
            RunnableC11786yL0 runnableC11786yL0 = this.f44829a;
            if (j == runnableC11786yL0.f46207j) {
                DownloadManager downloadManager = (DownloadManager) C11277uL0.f43672b.getApplicationContext().getSystemService("download");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(runnableC11786yL0.f46207j);
                Cursor cursorQuery = downloadManager.query(query);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    long j2 = cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far"));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                    cursorQuery.close();
                    String str = runnableC11786yL0.f46199b;
                    HashMap map = RunnableC11786yL0.f46196y;
                    C11405vL0 c11405vL0 = !map.containsKey(str) ? null : (C11405vL0) map.get(str);
                    float f = j3 > 0 ? j2 / j3 : 0.0f;
                    if (c11405vL0 != null && c11405vL0.m25401a(f)) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("taskId", String.valueOf(runnableC11786yL0.f46199b));
                        writableMapCreateMap.putString("written", String.valueOf(j2));
                        writableMapCreateMap.putString("total", String.valueOf(j3));
                        writableMapCreateMap.putString("chunk", "");
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C11277uL0.f43672b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
                    }
                    if (j3 == j2) {
                        runnableC11786yL0.f46218u.cancel(true);
                    }
                }
            }
        }
        return true;
    }
}
