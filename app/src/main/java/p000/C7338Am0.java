package p000;

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
public final class C7338Am0 implements InterfaceC6443mi {

    /* renamed from: f */
    public static final Bitmap.Config f361f = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C9062d21 f362a;

    /* renamed from: b */
    public final Set f363b;

    /* renamed from: c */
    public final C4049fN f364c;

    /* renamed from: d */
    public final long f365d;

    /* renamed from: e */
    public long f366e;

    public C7338Am0(long j) {
        C9062d21 c9062d21 = new C9062d21();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f365d = j;
        this.f362a = c9062d21;
        this.f363b = setUnmodifiableSet;
        this.f364c = new C4049fN(17);
    }

    /* renamed from: a */
    public final synchronized Bitmap m316a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM17474b;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM17474b = this.f362a.m17474b(i, i2, config != null ? config : f361f);
            if (bitmapM17474b != null) {
                long j = this.f366e;
                this.f362a.getClass();
                this.f366e = j - AbstractC7381Bh1.m804c(bitmapM17474b);
                this.f364c.getClass();
                bitmapM17474b.setHasAlpha(true);
                bitmapM17474b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f362a.getClass();
                C9062d21.m17472c(AbstractC7381Bh1.m805d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f362a.getClass();
                C9062d21.m17472c(AbstractC7381Bh1.m805d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f362a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM17474b;
    }

    /* renamed from: b */
    public final synchronized void m317b(long j) {
        while (this.f366e > j) {
            C9062d21 c9062d21 = this.f362a;
            Bitmap bitmap = (Bitmap) c9062d21.f25775b.m1088l1();
            if (bitmap != null) {
                c9062d21.m17473a(Integer.valueOf(AbstractC7381Bh1.m804c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f362a);
                }
                this.f366e = 0L;
                return;
            }
            this.f364c.getClass();
            long j2 = this.f366e;
            this.f362a.getClass();
            this.f366e = j2 - AbstractC7381Bh1.m804c(bitmap);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f362a.getClass();
                C9062d21.m17472c(AbstractC7381Bh1.m804c(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f362a);
            }
            bitmap.recycle();
        }
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: h */
    public final Bitmap mo318h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM316a = m316a(i, i2, config);
        if (bitmapM316a != null) {
            return bitmapM316a;
        }
        if (config == null) {
            config = f361f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: i */
    public final synchronized void mo319i(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f362a.getClass();
                if (AbstractC7381Bh1.m804c(bitmap) <= this.f365d && this.f363b.contains(bitmap.getConfig())) {
                    this.f362a.getClass();
                    int iM804c = AbstractC7381Bh1.m804c(bitmap);
                    this.f362a.m17476e(bitmap);
                    this.f364c.getClass();
                    this.f366e += iM804c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f362a.getClass();
                        C9062d21.m17472c(AbstractC7381Bh1.m804c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f362a);
                    }
                    m317b(this.f365d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f362a.getClass();
                C9062d21.m17472c(AbstractC7381Bh1.m804c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f363b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: o */
    public final Bitmap mo320o(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM316a = m316a(i, i2, config);
        if (bitmapM316a != null) {
            bitmapM316a.eraseColor(0);
            return bitmapM316a;
        }
        if (config == null) {
            config = f361f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: q */
    public final void mo321q(int i) {
        if (i >= 40 || i >= 20) {
            mo322r();
        } else if (i >= 20 || i == 15) {
            m317b(this.f365d / 2);
        }
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: r */
    public final void mo322r() {
        m317b(0L);
    }
}
