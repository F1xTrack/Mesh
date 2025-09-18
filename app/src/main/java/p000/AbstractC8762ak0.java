package p000;

import androidx.lifecycle.AbstractC1743b;

/* renamed from: ak0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8762ak0 {

    /* renamed from: a */
    public final InterfaceC9305ex0 f15661a;

    /* renamed from: b */
    public boolean f15662b;

    /* renamed from: c */
    public int f15663c = -1;

    /* renamed from: d */
    public final /* synthetic */ AbstractC1743b f15664d;

    public AbstractC8762ak0(AbstractC1743b abstractC1743b, InterfaceC9305ex0 interfaceC9305ex0) {
        this.f15664d = abstractC1743b;
        this.f15661a = interfaceC9305ex0;
    }

    /* renamed from: a */
    public final void m9798a(boolean z) {
        if (z == this.f15662b) {
            return;
        }
        this.f15662b = z;
        int i = z ? 1 : -1;
        AbstractC1743b abstractC1743b = this.f15664d;
        int i2 = abstractC1743b.f16318c;
        abstractC1743b.f16318c = i + i2;
        if (!abstractC1743b.f16319d) {
            abstractC1743b.f16319d = true;
            while (true) {
                try {
                    int i3 = abstractC1743b.f16318c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        abstractC1743b.mo1869g();
                    } else if (z3) {
                        abstractC1743b.mo1870h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    abstractC1743b.f16319d = false;
                    throw th;
                }
            }
            abstractC1743b.f16319d = false;
        }
        if (this.f15662b) {
            abstractC1743b.m10132c(this);
        }
    }

    /* renamed from: c */
    public boolean mo9800c(InterfaceC7902Li0 interfaceC7902Li0) {
        return false;
    }

    /* renamed from: d */
    public abstract boolean mo9584d();

    /* renamed from: b */
    public void mo9799b() {
    }
}
