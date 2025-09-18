package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: Am0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057Am0 implements InterfaceC5935mi {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final C3315d21 a;
    public final Set b;
    public final C3759fN c;
    public final long d;
    public long e;

    public C0057Am0(long j) {
        C3315d21 c3315d21 = new C3315d21();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = c3315d21;
        this.b = setUnmodifiableSet;
        this.c = new C3759fN(17);
    }

    public final synchronized Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.a.b(i, i2, config != null ? config : f);
            if (bitmapB != null) {
                long j = this.e;
                this.a.getClass();
                this.e = j - AbstractC0121Bh1.c(bitmapB);
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                C3315d21.c(AbstractC0121Bh1.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                C3315d21.c(AbstractC0121Bh1.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void b(long j) {
        while (this.e > j) {
            C3315d21 c3315d21 = this.a;
            Bitmap bitmap = (Bitmap) c3315d21.b.l1();
            if (bitmap != null) {
                c3315d21.a(Integer.valueOf(AbstractC0121Bh1.c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.e = 0L;
                return;
            }
            this.c.getClass();
            long j2 = this.e;
            this.a.getClass();
            this.e = j2 - AbstractC0121Bh1.c(bitmap);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                C3315d21.c(AbstractC0121Bh1.c(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            bitmap.recycle();
        }
    }

    @Override // defpackage.InterfaceC5935mi
    public final Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapA = a(i, i2, config);
        if (bitmapA != null) {
            return bitmapA;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC5935mi
    public final synchronized void i(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (AbstractC0121Bh1.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int iC = AbstractC0121Bh1.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.e += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        C3315d21.c(AbstractC0121Bh1.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    b(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                C3315d21.c(AbstractC0121Bh1.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC5935mi
    public final Bitmap o(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapA = a(i, i2, config);
        if (bitmapA != null) {
            bitmapA.eraseColor(0);
            return bitmapA;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC5935mi
    public final void q(int i) {
        if (i >= 40 || i >= 20) {
            r();
        } else if (i >= 20 || i == 15) {
            b(this.d / 2);
        }
    }

    @Override // defpackage.InterfaceC5935mi
    public final void r() {
        b(0L);
    }
}
