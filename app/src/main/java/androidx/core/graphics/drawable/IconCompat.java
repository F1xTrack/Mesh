package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p000.K50;
import p000.M50;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f16096k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f16097a;

    /* renamed from: b */
    public Object f16098b;

    /* renamed from: c */
    public byte[] f16099c;

    /* renamed from: d */
    public Parcelable f16100d;

    /* renamed from: e */
    public int f16101e;

    /* renamed from: f */
    public int f16102f;

    /* renamed from: g */
    public ColorStateList f16103g;

    /* renamed from: h */
    public PorterDuff.Mode f16104h;

    /* renamed from: i */
    public String f16105i;

    /* renamed from: j */
    public String f16106j;

    public IconCompat() {
        this.f16097a = -1;
        this.f16099c = null;
        this.f16100d = null;
        this.f16101e = 0;
        this.f16102f = 0;
        this.f16103g = null;
        this.f16104h = f16096k;
        this.f16105i = null;
    }

    /* renamed from: a */
    public static Bitmap m9977a(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static IconCompat m9978b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f16101e = i;
        iconCompat.f16098b = "";
        iconCompat.f16106j = "";
        return iconCompat;
    }

    /* renamed from: c */
    public final int m9979c() {
        int i = this.f16097a;
        if (i != -1) {
            if (i == 2) {
                return this.f16101e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f16098b;
        if (i2 >= 28) {
            return M50.m5257a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public final int m9980d() {
        int i = this.f16097a;
        if (i != -1) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f16098b;
        if (i2 >= 28) {
            return M50.m5259c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    /* renamed from: e */
    public final Uri m9981e() {
        int i = this.f16097a;
        if (i == -1) {
            return K50.m4554a(this.f16098b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f16098b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f16097a == -1) {
            return String.valueOf(this.f16098b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f16097a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = Core.NotificationType.DATA;
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        sb.append(str);
        switch (this.f16097a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f16098b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f16098b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f16106j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m9979c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f16101e);
                if (this.f16102f != 0) {
                    sb.append(" off=");
                    sb.append(this.f16102f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f16098b);
                break;
        }
        if (this.f16103g != null) {
            sb.append(" tint=");
            sb.append(this.f16103g);
        }
        if (this.f16104h != f16096k) {
            sb.append(" mode=");
            sb.append(this.f16104h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f16099c = null;
        this.f16100d = null;
        this.f16101e = 0;
        this.f16102f = 0;
        this.f16103g = null;
        this.f16104h = f16096k;
        this.f16105i = null;
        this.f16097a = i;
    }
}
