package defpackage;

import android.view.View;
import java.util.Arrays;

/* renamed from: aR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133aR {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public C2133aR(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.c;
            if (length < i4 + i3) {
                this.f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.c, i3);
            this.c += i3;
        }
    }

    public void b() {
        this.c = this.d ? ((C1262Py0) this.f).g() : ((C1262Py0) this.f).j();
    }

    public void c(int i, View view) {
        if (this.d) {
            this.c = ((C1262Py0) this.f).l() + ((C1262Py0) this.f).b(view);
        } else {
            this.c = ((C1262Py0) this.f).e(view);
        }
        this.b = i;
    }

    public void d(int i, View view) {
        int iL = ((C1262Py0) this.f).l();
        if (iL >= 0) {
            c(i, view);
            return;
        }
        this.b = i;
        if (!this.d) {
            int iE = ((C1262Py0) this.f).e(view);
            int iJ = iE - ((C1262Py0) this.f).j();
            this.c = iE;
            if (iJ > 0) {
                int iG = (((C1262Py0) this.f).g() - Math.min(0, (((C1262Py0) this.f).g() - iL) - ((C1262Py0) this.f).b(view))) - (((C1262Py0) this.f).c(view) + iE);
                if (iG < 0) {
                    this.c -= Math.min(iJ, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((C1262Py0) this.f).g() - iL) - ((C1262Py0) this.f).b(view);
        this.c = ((C1262Py0) this.f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.c - ((C1262Py0) this.f).c(view);
            int iJ2 = ((C1262Py0) this.f).j();
            int iMin = iC - (Math.min(((C1262Py0) this.f).e(view) - iJ2, 0) + iJ2);
            if (iMin < 0) {
                this.c = Math.min(iG2, -iMin) + this.c;
            }
        }
    }

    public boolean e(int i) {
        if (!this.d) {
            return false;
        }
        this.c -= i;
        this.d = false;
        this.e = true;
        return true;
    }

    public void f(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void g() {
        switch (this.a) {
            case 1:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                break;
            default:
                this.d = false;
                this.e = false;
                break;
        }
    }

    public void h(int i) {
        YN1.f(!this.d);
        boolean z = i == this.b;
        this.d = z;
        if (z) {
            this.c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return F91.w(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public C2133aR(BB0 bb0) {
        this.f = bb0;
    }

    public C2133aR() {
        g();
    }
}
