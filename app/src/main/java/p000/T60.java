package p000;

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

    /* renamed from: a */
    public final /* synthetic */ ImageLoaderModule f11153a;

    /* renamed from: b */
    public final /* synthetic */ ReadableArray f11154b;

    /* renamed from: c */
    public final /* synthetic */ Promise f11155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T60(ImageLoaderModule imageLoaderModule, ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f11153a = imageLoaderModule;
        this.f11154b = readableArray;
        this.f11155c = promise;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        O90.m5968f((Void[]) objArr, "params");
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.m5967e(writableMapCreateMap, "createMap(...)");
        Z60 imagePipeline = this.f11153a.getImagePipeline();
        ReadableArray readableArray = this.f11154b;
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            String string = readableArray.getString(i);
            if (string.length() > 0) {
                Uri uri = Uri.parse(string);
                imagePipeline.getClass();
                if (uri == null ? false : ((InterfaceC10443nq0) imagePipeline.f14729e.f1250b).mo1065e(new C0267EE(20, uri))) {
                    writableMapCreateMap.putString(string, "memory");
                } else if (imagePipeline.m9487b(uri, EnumC10481o70.f38818a) || imagePipeline.m9487b(uri, EnumC10481o70.f38819b)) {
                    writableMapCreateMap.putString(string, "disk");
                }
            }
        }
        this.f11155c.resolve(writableMapCreateMap);
    }
}
