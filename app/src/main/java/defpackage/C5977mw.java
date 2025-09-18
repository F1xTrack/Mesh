package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: mw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5977mw {
    public static File a(Context context, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        Bitmap bitmapDecodeFile;
        if (i > i3) {
            i7 = (int) (i2 * (i3 / i));
            i6 = i3;
        } else {
            i6 = i;
            i7 = i2;
        }
        if (i7 > i4) {
            i6 = (int) (i6 * (i4 / i7));
            i7 = i4;
        }
        Pair pairCreate = Pair.create(Integer.valueOf(i6), Integer.valueOf(i7));
        int iIntValue = ((Integer) pairCreate.first).intValue();
        int iIntValue2 = ((Integer) pairCreate.second).intValue();
        if (i > i3 || i2 > i4) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (i > iIntValue || i2 > iIntValue2) {
                int i9 = i / 2;
                int i10 = i2 / 2;
                i8 = 1;
                while (i9 / i8 >= iIntValue && i10 / i8 >= iIntValue2) {
                    i8 *= 2;
                }
            } else {
                i8 = 1;
            }
            options.inSampleSize = i8;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        }
        String attribute = new ExifInterface(str).getAttribute("Orientation");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue, iIntValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + ".jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i5, bufferedOutputStream);
        if (!attribute.equals(String.valueOf(1)) && !attribute.equals(String.valueOf(0))) {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute("Orientation", attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        bitmapCreateScaledBitmap.recycle();
        return file;
    }
}
