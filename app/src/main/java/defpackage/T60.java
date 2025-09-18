package defpackage;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.image.ImageLoaderModule;

/* loaded from: classes.dex */
public final class T60 extends GuardedAsyncTask {
    public final /* synthetic */ ImageLoaderModule a;
    public final /* synthetic */ ReadableArray b;
    public final /* synthetic */ Promise c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T60(ImageLoaderModule imageLoaderModule, ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.a = imageLoaderModule;
        this.b = readableArray;
        this.c = promise;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        O90.f((Void[]) objArr, "params");
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.e(writableMapCreateMap, "createMap(...)");
        Z60 imagePipeline = this.a.getImagePipeline();
        ReadableArray readableArray = this.b;
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            String string = readableArray.getString(i);
            if (string.length() > 0) {
                Uri uri = Uri.parse(string);
                imagePipeline.getClass();
                if (uri == null ? false : ((InterfaceC6151nq0) imagePipeline.e.b).e(new EE(20, uri))) {
                    writableMapCreateMap.putString(string, "memory");
                } else if (imagePipeline.b(uri, EnumC6207o70.a) || imagePipeline.b(uri, EnumC6207o70.b)) {
                    writableMapCreateMap.putString(string, "disk");
                }
            }
        }
        this.c.resolve(writableMapCreateMap);
    }
}
