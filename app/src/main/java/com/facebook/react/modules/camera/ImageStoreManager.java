package com.facebook.react.modules.camera;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import p000.C11377v70;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.RunnableC6757rf;

@InterfaceC9101dL0(name = "ImageStoreManager")
@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m22267d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "uri", "Lcom/facebook/react/bridge/Callback;", "success", "error", "LTf1;", "getBase64ForTag", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "Companion", "v70", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;
    public static final C11377v70 Companion = new C11377v70();
    public static final String NAME = "ImageStoreManager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) throws IOException {
        O90.m5968f(imageStoreManager, "this$0");
        O90.m5968f(str, "$uri");
        O90.m5968f(callback, "$success");
        O90.m5968f(callback2, "$error");
        try {
            InputStream inputStreamOpenInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            O90.m5966d(inputStreamOpenInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    Companion.getClass();
                    callback.invoke(C11377v70.m25364b(inputStreamOpenInputStream));
                } catch (Throwable th) {
                    Companion.getClass();
                    C11377v70.m25363a(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (IOException e) {
                callback2.invoke(e.getMessage());
                Companion.getClass();
            }
            C11377v70.m25363a(inputStreamOpenInputStream);
        } catch (FileNotFoundException e2) {
            callback2.invoke(e2.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(String uri, Callback success, Callback error) {
        O90.m5968f(uri, "uri");
        O90.m5968f(success, "success");
        O90.m5968f(error, "error");
        Executors.newSingleThreadExecutor().execute(new RunnableC6757rf(this, uri, success, error, 9));
    }
}
