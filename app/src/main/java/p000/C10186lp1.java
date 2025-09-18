package p000;

import com.facebook.react.common.mapbuffer.WritableMapBuffer;

/* renamed from: lp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10186lp1 implements InterfaceC8482Wm0 {

    /* renamed from: a */
    public final int f37308a;

    /* renamed from: b */
    public final int f37309b;

    /* renamed from: c */
    public final EnumC8430Vm0 f37310c;

    /* renamed from: d */
    public final /* synthetic */ WritableMapBuffer f37311d;

    public C10186lp1(WritableMapBuffer writableMapBuffer, int i) {
        EnumC8430Vm0 enumC8430Vm0;
        this.f37311d = writableMapBuffer;
        this.f37308a = i;
        int iKeyAt = writableMapBuffer.f17902a.keyAt(i);
        this.f37309b = iKeyAt;
        Object objValueAt = writableMapBuffer.f17902a.valueAt(i);
        O90.m5967e(objValueAt, "valueAt(...)");
        writableMapBuffer.getClass();
        if (objValueAt instanceof Boolean) {
            enumC8430Vm0 = EnumC8430Vm0.f12717a;
        } else if (objValueAt instanceof Integer) {
            enumC8430Vm0 = EnumC8430Vm0.f12718b;
        } else if (objValueAt instanceof Long) {
            enumC8430Vm0 = EnumC8430Vm0.f12722f;
        } else if (objValueAt instanceof Double) {
            enumC8430Vm0 = EnumC8430Vm0.f12719c;
        } else if (objValueAt instanceof String) {
            enumC8430Vm0 = EnumC8430Vm0.f12720d;
        } else {
            if (!(objValueAt instanceof InterfaceC8534Xm0)) {
                throw new IllegalStateException("Key " + iKeyAt + " has value of unknown type: " + objValueAt.getClass());
            }
            enumC8430Vm0 = EnumC8430Vm0.f12721e;
        }
        this.f37310c = enumC8430Vm0;
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: a */
    public final long mo8851a() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Long) {
            return ((Number) objValueAt).longValue();
        }
        throw new IllegalStateException(("Expected " + Long.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: b */
    public final double mo8852b() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Double) {
            return ((Number) objValueAt).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: c */
    public final String mo8853c() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof String) {
            return (String) objValueAt;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: d */
    public final int mo8854d() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Integer) {
            return ((Number) objValueAt).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: e */
    public final InterfaceC8534Xm0 mo8855e() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof InterfaceC8534Xm0) {
            return (InterfaceC8534Xm0) objValueAt;
        }
        throw new IllegalStateException(("Expected " + InterfaceC8534Xm0.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    /* renamed from: f */
    public final boolean mo8856f() {
        Object objValueAt = this.f37311d.f17902a.valueAt(this.f37308a);
        int i = this.f37309b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Boolean) {
            return ((Boolean) objValueAt).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8482Wm0
    public final int getKey() {
        return this.f37309b;
    }

    @Override // p000.InterfaceC8482Wm0
    public final EnumC8430Vm0 getType() {
        return this.f37310c;
    }
}
