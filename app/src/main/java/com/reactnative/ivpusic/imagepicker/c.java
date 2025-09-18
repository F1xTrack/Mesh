package com.reactnative.ivpusic.imagepicker;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;

/* loaded from: classes2.dex */
public final class c implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                String str = (String) objArr[0];
                try {
                    Bitmap bitmapValidateVideo = dVar.c.validateVideo(str);
                    long jLastModified = new File(str).lastModified();
                    long jLongValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt(Snapshot.WIDTH, bitmapValidateVideo.getWidth());
                    writableNativeMap.putInt(Snapshot.HEIGHT, bitmapValidateVideo.getHeight());
                    writableNativeMap.putString("mime", dVar.b);
                    writableNativeMap.putInt("size", (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) jLongValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString("modificationDate", String.valueOf(jLastModified));
                    dVar.c.resultCollector.d(writableNativeMap);
                    break;
                } catch (Exception e) {
                    dVar.c.resultCollector.b("E_NO_IMAGE_DATA_FOUND", e);
                    return;
                }
            default:
                WritableNativeMap writableNativeMap2 = (WritableNativeMap) objArr[0];
                this.b.c.resultCollector.c(writableNativeMap2.getString("code"), writableNativeMap2.getString("message"));
                break;
        }
    }
}
