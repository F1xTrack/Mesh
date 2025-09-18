package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.image.EncodedImage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: xk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11709xk0 extends AbstractC7438Ck0 {

    /* renamed from: c */
    public final /* synthetic */ int f45764c;

    /* renamed from: d */
    public final ContentResolver f45765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11709xk0(ExecutorService executorService, C1339VH c1339vh, ContentResolver contentResolver, int i) {
        super(executorService, c1339vh);
        this.f45764c = i;
        switch (i) {
            case 1:
                O90.m5968f(executorService, "executor");
                O90.m5968f(c1339vh, "pooledByteBufferFactory");
                O90.m5968f(contentResolver, "contentResolver");
                super(executorService, c1339vh);
                this.f45765d = contentResolver;
                break;
            default:
                O90.m5968f(executorService, "executor");
                O90.m5968f(c1339vh, "pooledByteBufferFactory");
                O90.m5968f(contentResolver, "contentResolver");
                this.f45765d = contentResolver;
                break;
        }
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: d */
    public final EncodedImage mo1306d(C10737q70 c10737q70) throws IOException {
        EncodedImage encodedImage;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        ContentResolver contentResolver = this.f45765d;
        int i = this.f45764c;
        O90.m5968f(c10737q70, "imageRequest");
        switch (i) {
            case 0:
                Uri uri = c10737q70.f40609b;
                O90.m5967e(uri, "imageRequest.sourceUri");
                Uri uri2 = AbstractC8885bh1.f17121a;
                if (uri.getPath() == null || !RemoteMessageConst.Notification.CONTENT.equals(AbstractC8885bh1.m10481b(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(AbstractC8885bh1.f17121a.getPath())) {
                    if (AbstractC8885bh1.m10482c(uri)) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        } catch (FileNotFoundException unused) {
                            encodedImage = null;
                        }
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        EncodedImage encodedImageM1305c = m1305c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                        parcelFileDescriptorOpenFileDescriptor.close();
                        encodedImage = encodedImageM1305c;
                        if (encodedImage != null) {
                            return encodedImage;
                        }
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        return m1305c(inputStreamOpenInputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String string = uri.toString();
                O90.m5967e(string, "uri.toString()");
                if (D51.m1550i(string, "/photo")) {
                    inputStreamCreateInputStream = contentResolver.openInputStream(uri);
                } else {
                    String string2 = uri.toString();
                    O90.m5967e(string2, "uri.toString()");
                    if (D51.m1550i(string2, "/display_photo")) {
                        try {
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                        } catch (IOException unused2) {
                            throw new IOException(AbstractC11153tN0.m24911w("Contact photo does not exist: ", uri));
                        }
                    } else {
                        InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (inputStreamOpenContactPhotoInputStream == null) {
                            throw new IOException(AbstractC11153tN0.m24911w("Contact photo does not exist: ", uri));
                        }
                        inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                    }
                }
                if (inputStreamCreateInputStream != null) {
                    return m1305c(inputStreamCreateInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(c10737q70.f40609b);
                if (inputStreamOpenInputStream2 != null) {
                    return m1305c(inputStreamOpenInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream");
        }
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: e */
    public final String mo1307e() {
        switch (this.f45764c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
