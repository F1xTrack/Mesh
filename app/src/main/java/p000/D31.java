package p000;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class D31 extends AbstractC10930rd1 {

    /* renamed from: c */
    public static final C0198D8 f1811c = new C0198D8(4);

    /* renamed from: a */
    public final /* synthetic */ int f1812a;

    /* renamed from: b */
    public final AbstractC10930rd1 f1813b;

    public /* synthetic */ D31(AbstractC10930rd1 abstractC10930rd1, int i) {
        this.f1812a = i;
        this.f1813b = abstractC10930rd1;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        switch (this.f1812a) {
            case 0:
                Date date = (Date) this.f1813b.mo480a(c11820yc0);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.f1813b.mo480a(c11820yc0)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                c11820yc0.m26187m();
                while (c11820yc0.m26177J()) {
                    arrayList.add(Long.valueOf(((Number) this.f1813b.mo480a(c11820yc0)).longValue()));
                }
                c11820yc0.m26201w();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (c11820yc0.m26194p0() != 9) {
                    return this.f1813b.mo480a(c11820yc0);
                }
                c11820yc0.m26186i0();
                return null;
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        switch (this.f1812a) {
            case 0:
                this.f1813b.mo481b(c7838Kc0, (Timestamp) obj);
                break;
            case 1:
                this.f1813b.mo481b(c7838Kc0, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c7838Kc0.m4690n();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f1813b.mo481b(c7838Kc0, Long.valueOf(atomicLongArray.get(i)));
                }
                c7838Kc0.m4693w();
                break;
            default:
                if (obj == null) {
                    c7838Kc0.m4680J();
                    break;
                } else {
                    this.f1813b.mo481b(c7838Kc0, obj);
                    break;
                }
        }
    }
}
