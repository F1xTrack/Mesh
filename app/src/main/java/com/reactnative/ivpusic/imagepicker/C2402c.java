package com.reactnative.ivpusic.imagepicker;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;

/* renamed from: com.reactnative.ivpusic.imagepicker.c */
/* loaded from: classes2.dex */
public final class C2402c implements Callback {

    /* renamed from: a */
    public final /* synthetic */ int f20240a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC2403d f20241b;

    public /* synthetic */ C2402c(RunnableC2403d runnableC2403d, int i) {
        this.f20240a = i;
        this.f20241b = runnableC2403d;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.f20240a) {
            case 0:
                RunnableC2403d runnableC2403d = this.f20241b;
                String str = (String) objArr[0];
                try {
                    Bitmap bitmapValidateVideo = runnableC2403d.f20244c.validateVideo(str);
                    long jLastModified = new File(str).lastModified();
                    long jLongValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt(Snapshot.WIDTH, bitmapValidateVideo.getWidth());
                    writableNativeMap.putInt(Snapshot.HEIGHT, bitmapValidateVideo.getHeight());
                    writableNativeMap.putString("mime", runnableC2403d.f20243b);
                    writableNativeMap.putInt("size", (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) jLongValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString("modificationDate", String.valueOf(jLastModified));
                    runnableC2403d.f20244c.resultCollector.m6714d(writableNativeMap);
                    break;
                } catch (Exception e) {
                    runnableC2403d.f20244c.resultCollector.m6712b("E_NO_IMAGE_DATA_FOUND", e);
                    return;
                }
            default:
                WritableNativeMap writableNativeMap2 = (WritableNativeMap) objArr[0];
                this.f20241b.f20244c.resultCollector.m6713c(writableNativeMap2.getString("code"), writableNativeMap2.getString("message"));
                break;
        }
    }
}
