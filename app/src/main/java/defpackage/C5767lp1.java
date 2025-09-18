package defpackage;

import com.facebook.react.common.mapbuffer.WritableMapBuffer;

/* renamed from: lp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5767lp1 implements InterfaceC1772Wm0 {
    public final int a;
    public final int b;
    public final EnumC1694Vm0 c;
    public final /* synthetic */ WritableMapBuffer d;

    public C5767lp1(WritableMapBuffer writableMapBuffer, int i) {
        EnumC1694Vm0 enumC1694Vm0;
        this.d = writableMapBuffer;
        this.a = i;
        int iKeyAt = writableMapBuffer.a.keyAt(i);
        this.b = iKeyAt;
        Object objValueAt = writableMapBuffer.a.valueAt(i);
        O90.e(objValueAt, "valueAt(...)");
        writableMapBuffer.getClass();
        if (objValueAt instanceof Boolean) {
            enumC1694Vm0 = EnumC1694Vm0.a;
        } else if (objValueAt instanceof Integer) {
            enumC1694Vm0 = EnumC1694Vm0.b;
        } else if (objValueAt instanceof Long) {
            enumC1694Vm0 = EnumC1694Vm0.f;
        } else if (objValueAt instanceof Double) {
            enumC1694Vm0 = EnumC1694Vm0.c;
        } else if (objValueAt instanceof String) {
            enumC1694Vm0 = EnumC1694Vm0.d;
        } else {
            if (!(objValueAt instanceof InterfaceC1850Xm0)) {
                throw new IllegalStateException("Key " + iKeyAt + " has value of unknown type: " + objValueAt.getClass());
            }
            enumC1694Vm0 = EnumC1694Vm0.e;
        }
        this.c = enumC1694Vm0;
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final long a() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Long) {
            return ((Number) objValueAt).longValue();
        }
        throw new IllegalStateException(("Expected " + Long.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final double b() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Double) {
            return ((Number) objValueAt).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final String c() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof String) {
            return (String) objValueAt;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final int d() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Integer) {
            return ((Number) objValueAt).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final InterfaceC1850Xm0 e() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof InterfaceC1850Xm0) {
            return (InterfaceC1850Xm0) objValueAt;
        }
        throw new IllegalStateException(("Expected " + InterfaceC1850Xm0.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final boolean f() {
        Object objValueAt = this.d.a.valueAt(this.a);
        int i = this.b;
        if (objValueAt == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Key not found: ").toString());
        }
        if (objValueAt instanceof Boolean) {
            return ((Boolean) objValueAt).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i + ", found " + objValueAt.getClass() + " instead.").toString());
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final int getKey() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1772Wm0
    public final EnumC1694Vm0 getType() {
        return this.c;
    }
}
