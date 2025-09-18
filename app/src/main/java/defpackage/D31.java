package defpackage;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class D31 extends AbstractC6876rd1 {
    public static final D8 c = new D8(4);
    public final /* synthetic */ int a;
    public final AbstractC6876rd1 b;

    public /* synthetic */ D31(AbstractC6876rd1 abstractC6876rd1, int i) {
        this.a = i;
        this.b = abstractC6876rd1;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        switch (this.a) {
            case 0:
                Date date = (Date) this.b.a(c8206yc0);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.b.a(c8206yc0)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                c8206yc0.m();
                while (c8206yc0.J()) {
                    arrayList.add(Long.valueOf(((Number) this.b.a(c8206yc0)).longValue()));
                }
                c8206yc0.w();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (c8206yc0.p0() != 9) {
                    return this.b.a(c8206yc0);
                }
                c8206yc0.i0();
                return null;
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                this.b.b(c0807Kc0, (Timestamp) obj);
                break;
            case 1:
                this.b.b(c0807Kc0, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0807Kc0.n();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.b(c0807Kc0, Long.valueOf(atomicLongArray.get(i)));
                }
                c0807Kc0.w();
                break;
            default:
                if (obj == null) {
                    c0807Kc0.J();
                    break;
                } else {
                    this.b.b(c0807Kc0, obj);
                    break;
                }
        }
    }
}
