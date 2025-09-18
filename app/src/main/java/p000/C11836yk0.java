package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: yk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11836yk0 extends AbstractC7438Ck0 implements InterfaceC9516ga1 {

    /* renamed from: d */
    public static final String[] f46432d = {"_id", "_data"};

    /* renamed from: e */
    public static final String[] f46433e = {"_data"};

    /* renamed from: f */
    public static final Rect f46434f = new Rect(0, 0, 512, 384);

    /* renamed from: g */
    public static final Rect f46435g = new Rect(0, 0, 96, 96);

    /* renamed from: c */
    public final ContentResolver f46436c;

    public C11836yk0(ExecutorService executorService, C1339VH c1339vh, ContentResolver contentResolver) {
        super(executorService, c1339vh);
        this.f46436c = contentResolver;
    }

    @Override // p000.InterfaceC9516ga1
    /* renamed from: b */
    public final boolean mo313b(C9115dS0 c9115dS0) {
        Rect rect = f46434f;
        return AbstractC11432vY1.m25448e(rect.width(), rect.height(), c9115dS0);
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: d */
    public final EncodedImage mo1306d(C10737q70 c10737q70) {
        C9115dS0 c9115dS0;
        EncodedImage encodedImageM26217f;
        int iM4895a;
        Uri uri = c10737q70.f40609b;
        if (!AbstractC8885bh1.m10482c(uri) || (c9115dS0 = c10737q70.f40615h) == null) {
            return null;
        }
        Cursor cursorQuery = this.f46436c.query(uri, f46432d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (encodedImageM26217f = m26217f(c9115dS0, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string = cursorQuery.getString(columnIndex);
                if (string != null) {
                    try {
                        iM4895a = L22.m4895a(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    } catch (IOException unused) {
                        AbstractC3929dS.f26114a.getClass();
                    }
                    encodedImageM26217f.setRotationAngle(iM4895a);
                } else {
                    iM4895a = 0;
                    encodedImageM26217f.setRotationAngle(iM4895a);
                }
            }
            return encodedImageM26217f;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: e */
    public final String mo1307e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* renamed from: f */
    public final EncodedImage m26217f(C9115dS0 c9115dS0, long j) {
        int i;
        int columnIndex;
        Rect rect = f46435g;
        if (AbstractC11432vY1.m25448e(rect.width(), rect.height(), c9115dS0)) {
            i = 3;
        } else {
            Rect rect2 = f46434f;
            i = AbstractC11432vY1.m25448e(rect2.width(), rect2.height(), c9115dS0) ? 1 : 0;
        }
        if (i == 0) {
            return null;
        }
        Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f46436c, j, i, f46433e);
        if (cursorQueryMiniThumbnail == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return m1305c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
