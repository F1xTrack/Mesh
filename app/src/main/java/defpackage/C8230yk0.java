package defpackage;

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
public final class C8230yk0 extends AbstractC0207Ck0 implements InterfaceC3991ga1 {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public C8230yk0(ExecutorService executorService, VH vh, ContentResolver contentResolver) {
        super(executorService, vh);
        this.c = contentResolver;
    }

    @Override // defpackage.InterfaceC3991ga1
    public final boolean b(C3394dS0 c3394dS0) {
        Rect rect = f;
        return AbstractC7625vY1.e(rect.width(), rect.height(), c3394dS0);
    }

    @Override // defpackage.AbstractC0207Ck0
    public final EncodedImage d(C6589q70 c6589q70) {
        C3394dS0 c3394dS0;
        EncodedImage encodedImageF;
        int iA;
        Uri uri = c6589q70.b;
        if (!AbstractC2374bh1.c(uri) || (c3394dS0 = c6589q70.h) == null) {
            return null;
        }
        Cursor cursorQuery = this.c.query(uri, d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (encodedImageF = f(c3394dS0, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string = cursorQuery.getString(columnIndex);
                if (string != null) {
                    try {
                        iA = L22.a(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    } catch (IOException unused) {
                        AbstractC3393dS.a.getClass();
                    }
                    encodedImageF.setRotationAngle(iA);
                } else {
                    iA = 0;
                    encodedImageF.setRotationAngle(iA);
                }
            }
            return encodedImageF;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.AbstractC0207Ck0
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final EncodedImage f(C3394dS0 c3394dS0, long j) {
        int i;
        int columnIndex;
        Rect rect = g;
        if (AbstractC7625vY1.e(rect.width(), rect.height(), c3394dS0)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = AbstractC7625vY1.e(rect2.width(), rect2.height(), c3394dS0) ? 1 : 0;
        }
        if (i == 0) {
            return null;
        }
        Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e);
        if (cursorQueryMiniThumbnail == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
