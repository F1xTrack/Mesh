package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: f5 */
/* loaded from: classes.dex */
public final class C4031f5 implements InterfaceC10011kS0 {

    /* renamed from: a */
    public final /* synthetic */ int f27047a;

    /* renamed from: b */
    public final Object f27048b;

    public /* synthetic */ C4031f5(int i, Object obj) {
        this.f27047a = i;
        this.f27048b = obj;
    }

    @Override // p000.InterfaceC10011kS0
    /* renamed from: a */
    public final Class mo4302a() {
        switch (this.f27047a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f27048b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final Object get() {
        switch (this.f27047a) {
            case 0:
                return (AnimatedImageDrawable) this.f27048b;
            case 1:
                return (byte[]) this.f27048b;
            case 2:
                return (File) this.f27048b;
            default:
                return (Bitmap) this.f27048b;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final int getSize() {
        switch (this.f27047a) {
            case 0:
                return AbstractC7381Bh1.m805d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f27048b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f27048b).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f27048b).length;
            case 2:
                return 1;
            default:
                return AbstractC7381Bh1.m804c((Bitmap) this.f27048b);
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final void recycle() {
        switch (this.f27047a) {
            case 0:
                ((AnimatedImageDrawable) this.f27048b).stop();
                ((AnimatedImageDrawable) this.f27048b).clearAnimationCallbacks();
                break;
        }
    }

    public C4031f5(byte[] bArr) {
        this.f27047a = 1;
        IL1.m3830d(bArr, "Argument must not be null");
        this.f27048b = bArr;
    }

    public C4031f5(File file) {
        this.f27047a = 2;
        IL1.m3830d(file, "Argument must not be null");
        this.f27048b = file;
    }

    /* renamed from: b */
    private final void m18177b() {
    }

    /* renamed from: c */
    private final void m18178c() {
    }

    /* renamed from: d */
    private final void m18179d() {
    }
}
