package p000;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.blob.BlobModule;

/* renamed from: yi */
/* loaded from: classes.dex */
public final class C7218yi implements InterfaceC10453nv0 {

    /* renamed from: a */
    public final /* synthetic */ BlobModule f46421a;

    public C7218yi(BlobModule blobModule) {
        this.f46421a = blobModule;
    }

    /* renamed from: a */
    public final WritableMap m26216a(Uri uri) {
        BlobModule blobModule = this.f46421a;
        byte[] bytesFromUri = blobModule.getBytesFromUri(uri);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("blobId", blobModule.store(bytesFromUri));
        writableMapCreateMap.putInt("offset", 0);
        writableMapCreateMap.putInt("size", bytesFromUri.length);
        writableMapCreateMap.putString("type", blobModule.getMimeTypeFromUri(uri));
        writableMapCreateMap.putString("name", blobModule.getNameFromUri(uri));
        writableMapCreateMap.putDouble("lastModified", blobModule.getLastModifiedFromUri(uri));
        return writableMapCreateMap;
    }
}
