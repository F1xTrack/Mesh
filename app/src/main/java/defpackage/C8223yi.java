package defpackage;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.blob.BlobModule;

/* renamed from: yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8223yi implements InterfaceC6166nv0 {
    public final /* synthetic */ BlobModule a;

    public C8223yi(BlobModule blobModule) {
        this.a = blobModule;
    }

    public final WritableMap a(Uri uri) {
        BlobModule blobModule = this.a;
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
