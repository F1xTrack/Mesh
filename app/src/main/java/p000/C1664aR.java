package p000;

import android.view.View;
import java.util.Arrays;

/* renamed from: aR */
/* loaded from: classes.dex */
public final class C1664aR {

    /* renamed from: a */
    public final /* synthetic */ int f15508a = 1;

    /* renamed from: b */
    public int f15509b;

    /* renamed from: c */
    public int f15510c;

    /* renamed from: d */
    public boolean f15511d;

    /* renamed from: e */
    public boolean f15512e;

    /* renamed from: f */
    public Object f15513f;

    public C1664aR(int i) {
        this.f15509b = i;
        byte[] bArr = new byte[131];
        this.f15513f = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m9732a(byte[] bArr, int i, int i2) {
        if (this.f15511d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f15513f;
            int length = bArr2.length;
            int i4 = this.f15510c;
            if (length < i4 + i3) {
                this.f15513f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f15513f, this.f15510c, i3);
            this.f15510c += i3;
        }
    }

    /* renamed from: b */
    public void m9733b() {
        this.f15510c = this.f15511d ? ((C8142Py0) this.f15513f).m6498g() : ((C8142Py0) this.f15513f).m6501j();
    }

    /* renamed from: c */
    public void m9734c(int i, View view) {
        if (this.f15511d) {
            this.f15510c = ((C8142Py0) this.f15513f).m6503l() + ((C8142Py0) this.f15513f).m6493b(view);
        } else {
            this.f15510c = ((C8142Py0) this.f15513f).m6496e(view);
        }
        this.f15509b = i;
    }

    /* renamed from: d */
    public void m9735d(int i, View view) {
        int iM6503l = ((C8142Py0) this.f15513f).m6503l();
        if (iM6503l >= 0) {
            m9734c(i, view);
            return;
        }
        this.f15509b = i;
        if (!this.f15511d) {
            int iM6496e = ((C8142Py0) this.f15513f).m6496e(view);
            int iM6501j = iM6496e - ((C8142Py0) this.f15513f).m6501j();
            this.f15510c = iM6496e;
            if (iM6501j > 0) {
                int iM6498g = (((C8142Py0) this.f15513f).m6498g() - Math.min(0, (((C8142Py0) this.f15513f).m6498g() - iM6503l) - ((C8142Py0) this.f15513f).m6493b(view))) - (((C8142Py0) this.f15513f).m6494c(view) + iM6496e);
                if (iM6498g < 0) {
                    this.f15510c -= Math.min(iM6501j, -iM6498g);
                    return;
                }
                return;
            }
            return;
        }
        int iM6498g2 = (((C8142Py0) this.f15513f).m6498g() - iM6503l) - ((C8142Py0) this.f15513f).m6493b(view);
        this.f15510c = ((C8142Py0) this.f15513f).m6498g() - iM6498g2;
        if (iM6498g2 > 0) {
            int iM6494c = this.f15510c - ((C8142Py0) this.f15513f).m6494c(view);
            int iM6501j2 = ((C8142Py0) this.f15513f).m6501j();
            int iMin = iM6494c - (Math.min(((C8142Py0) this.f15513f).m6496e(view) - iM6501j2, 0) + iM6501j2);
            if (iMin < 0) {
                this.f15510c = Math.min(iM6498g2, -iMin) + this.f15510c;
            }
        }
    }

    /* renamed from: e */
    public boolean m9736e(int i) {
        if (!this.f15511d) {
            return false;
        }
        this.f15510c -= i;
        this.f15511d = false;
        this.f15512e = true;
        return true;
    }

    /* renamed from: f */
    public void m9737f(int i) {
        this.f15511d |= i > 0;
        this.f15509b += i;
    }

    /* renamed from: g */
    public void m9738g() {
        switch (this.f15508a) {
            case 1:
                this.f15509b = -1;
                this.f15510c = Integer.MIN_VALUE;
                this.f15511d = false;
                this.f15512e = false;
                break;
            default:
                this.f15511d = false;
                this.f15512e = false;
                break;
        }
    }

    /* renamed from: h */
    public void m9739h(int i) {
        YN1.m9281f(!this.f15511d);
        boolean z = i == this.f15509b;
        this.f15511d = z;
        if (z) {
            this.f15510c = 3;
            this.f15512e = false;
        }
    }

    public String toString() {
        switch (this.f15508a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f15509b);
                sb.append(", mCoordinate=");
                sb.append(this.f15510c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f15511d);
                sb.append(", mValid=");
                return F91.m2540w(sb, this.f15512e, '}');
            default:
                return super.toString();
        }
    }

    public C1664aR(BB0 bb0) {
        this.f15513f = bb0;
    }

    public C1664aR() {
        m9738g();
    }
}
