package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class BY0 implements CY0 {

    /* renamed from: a */
    public final List f875a;

    /* renamed from: b */
    public final C0239Dn f876b;

    /* renamed from: c */
    public final ExecutorC10151lY0 f877c;

    /* renamed from: d */
    public final int f878d;

    /* renamed from: e */
    public C11887z80 f879e = null;

    public BY0(int i, ArrayList arrayList, ExecutorC10151lY0 executorC10151lY0, C0239Dn c0239Dn) {
        this.f878d = i;
        this.f875a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f876b = c0239Dn;
        this.f877c = executorC10151lY0;
    }

    @Override // p000.CY0
    /* renamed from: a */
    public final Object mo220a() {
        return null;
    }

    @Override // p000.CY0
    /* renamed from: b */
    public final C11887z80 mo221b() {
        return this.f879e;
    }

    @Override // p000.CY0
    /* renamed from: c */
    public final Executor mo222c() {
        return this.f877c;
    }

    @Override // p000.CY0
    /* renamed from: d */
    public final int mo223d() {
        return this.f878d;
    }

    @Override // p000.CY0
    /* renamed from: e */
    public final CameraCaptureSession.StateCallback mo224e() {
        return this.f876b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BY0) {
            BY0 by0 = (BY0) obj;
            if (Objects.equals(this.f879e, by0.f879e) && this.f878d == by0.f878d) {
                List list = this.f875a;
                int size = list.size();
                List list2 = by0.f875a;
                if (size == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (!((C8506Wy0) list.get(i)).equals(list2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.CY0
    /* renamed from: f */
    public final List mo225f() {
        return this.f875a;
    }

    @Override // p000.CY0
    /* renamed from: h */
    public final void mo227h(C11887z80 c11887z80) {
        if (this.f878d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.f879e = c11887z80;
    }

    public final int hashCode() {
        int iHashCode = this.f875a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        C11887z80 c11887z80 = this.f879e;
        int iHashCode2 = (c11887z80 == null ? 0 : c11887z80.f46643a.hashCode()) ^ i;
        return this.f878d ^ ((iHashCode2 << 5) - iHashCode2);
    }

    @Override // p000.CY0
    /* renamed from: g */
    public final void mo226g(CaptureRequest captureRequest) {
    }
}
