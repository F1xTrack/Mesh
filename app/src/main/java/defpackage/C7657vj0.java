package defpackage;

import java.util.List;

/* renamed from: vj0 */
/* loaded from: classes.dex */
public final class C7657vj0 extends AbstractC8037xj0 {
    @Override // defpackage.AbstractC8037xj0
    public final void a(long j, Object obj) {
        ((T0) ((InterfaceC7739w90) AbstractC1131Og1.d.i(j, obj))).a = false;
    }

    @Override // defpackage.AbstractC8037xj0
    public final void b(B00 b00, B00 b002, long j) {
        AbstractC0975Mg1 abstractC0975Mg1 = AbstractC1131Og1.d;
        InterfaceC7739w90 interfaceC7739w90E = (InterfaceC7739w90) abstractC0975Mg1.i(j, b00);
        InterfaceC7739w90 interfaceC7739w90 = (InterfaceC7739w90) abstractC0975Mg1.i(j, b002);
        int size = interfaceC7739w90E.size();
        int size2 = interfaceC7739w90.size();
        if (size > 0 && size2 > 0) {
            if (!((T0) interfaceC7739w90E).a) {
                interfaceC7739w90E = interfaceC7739w90E.e(size2 + size);
            }
            interfaceC7739w90E.addAll(interfaceC7739w90);
        }
        if (size > 0) {
            interfaceC7739w90 = interfaceC7739w90E;
        }
        AbstractC1131Og1.r(j, b00, interfaceC7739w90);
    }

    @Override // defpackage.AbstractC8037xj0
    public final List c(long j, Object obj) {
        InterfaceC7739w90 interfaceC7739w90 = (InterfaceC7739w90) AbstractC1131Og1.d.i(j, obj);
        if (((T0) interfaceC7739w90).a) {
            return interfaceC7739w90;
        }
        int size = interfaceC7739w90.size();
        InterfaceC7739w90 interfaceC7739w90E = interfaceC7739w90.e(size == 0 ? 10 : size * 2);
        AbstractC1131Og1.r(j, obj, interfaceC7739w90E);
        return interfaceC7739w90E;
    }
}
