package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: xk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8040xk0 extends AbstractC0207Ck0 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8040xk0(ExecutorService executorService, VH vh, ContentResolver contentResolver, int i) {
        super(executorService, vh);
        this.c = i;
        switch (i) {
            case 1:
                O90.f(executorService, "executor");
                O90.f(vh, "pooledByteBufferFactory");
                O90.f(contentResolver, "contentResolver");
                super(executorService, vh);
                this.d = contentResolver;
                break;
            default:
                O90.f(executorService, "executor");
                O90.f(vh, "pooledByteBufferFactory");
                O90.f(contentResolver, "contentResolver");
                this.d = contentResolver;
                break;
        }
    }

    @Override // defpackage.AbstractC0207Ck0
    public final EncodedImage d(C6589q70 c6589q70) throws IOException {
        EncodedImage encodedImage;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        ContentResolver contentResolver = this.d;
        int i = this.c;
        O90.f(c6589q70, "imageRequest");
        switch (i) {
            case 0:
                Uri uri = c6589q70.b;
                O90.e(uri, "imageRequest.sourceUri");
                Uri uri2 = AbstractC2374bh1.a;
                if (uri.getPath() == null || !RemoteMessageConst.Notification.CONTENT.equals(AbstractC2374bh1.b(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(AbstractC2374bh1.a.getPath())) {
                    if (AbstractC2374bh1.c(uri)) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        } catch (FileNotFoundException unused) {
                            encodedImage = null;
                        }
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        EncodedImage encodedImageC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                        parcelFileDescriptorOpenFileDescriptor.close();
                        encodedImage = encodedImageC;
                        if (encodedImage != null) {
                            return encodedImage;
                        }
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        return c(inputStreamOpenInputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String string = uri.toString();
                O90.e(string, "uri.toString()");
                if (D51.i(string, "/photo")) {
                    inputStreamCreateInputStream = contentResolver.openInputStream(uri);
                } else {
                    String string2 = uri.toString();
                    O90.e(string2, "uri.toString()");
                    if (D51.i(string2, "/display_photo")) {
                        try {
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                        } catch (IOException unused2) {
                            throw new IOException(AbstractC7209tN0.w("Contact photo does not exist: ", uri));
                        }
                    } else {
                        InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (inputStreamOpenContactPhotoInputStream == null) {
                            throw new IOException(AbstractC7209tN0.w("Contact photo does not exist: ", uri));
                        }
                        inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                    }
                }
                if (inputStreamCreateInputStream != null) {
                    return c(inputStreamCreateInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(c6589q70.b);
                if (inputStreamOpenInputStream2 != null) {
                    return c(inputStreamOpenInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream");
        }
    }

    @Override // defpackage.AbstractC0207Ck0
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
