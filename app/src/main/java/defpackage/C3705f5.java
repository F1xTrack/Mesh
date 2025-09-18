package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3705f5 implements InterfaceC5506kS0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C3705f5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Class a() {
        switch (this.a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Object get() {
        switch (this.a) {
            case 0:
                return (AnimatedImageDrawable) this.b;
            case 1:
                return (byte[]) this.b;
            case 2:
                return (File) this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final int getSize() {
        switch (this.a) {
            case 0:
                return AbstractC0121Bh1.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.b).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.b).length;
            case 2:
                return 1;
            default:
                return AbstractC0121Bh1.c((Bitmap) this.b);
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final void recycle() {
        switch (this.a) {
            case 0:
                ((AnimatedImageDrawable) this.b).stop();
                ((AnimatedImageDrawable) this.b).clearAnimationCallbacks();
                break;
        }
    }

    public C3705f5(byte[] bArr) {
        this.a = 1;
        IL1.d(bArr, "Argument must not be null");
        this.b = bArr;
    }

    public C3705f5(File file) {
        this.a = 2;
        IL1.d(file, "Argument must not be null");
        this.b = file;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
