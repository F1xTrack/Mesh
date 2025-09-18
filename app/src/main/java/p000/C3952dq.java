package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: dq */
/* loaded from: classes.dex */
public final class C3952dq {

    /* renamed from: a */
    public final Object f26324a = new Object();

    /* renamed from: b */
    public final LongSparseArray f26325b = new LongSparseArray();

    /* renamed from: c */
    public final HashMap f26326c = new HashMap();

    /* renamed from: d */
    public final LongSparseArray f26327d = new LongSparseArray();

    /* renamed from: e */
    public InterfaceC3890cq f26328e;

    /* renamed from: a */
    public final void m17758a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f26324a) {
            try {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long jLongValue = l != null ? l.longValue() : -1L;
                if (jLongValue == -1) {
                    return;
                }
                LongSparseArray longSparseArray = this.f26325b;
                List arrayList = (List) longSparseArray.get(jLongValue);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    longSparseArray.put(jLongValue, arrayList);
                }
                arrayList.add(totalCaptureResult);
                this.f26326c.put(totalCaptureResult, Integer.valueOf(i));
                m17762e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m17759b() {
        synchronized (this.f26324a) {
            try {
                this.f26325b.clear();
                for (int i = 0; i < this.f26327d.size(); i++) {
                    Iterator it = ((List) this.f26327d.get(this.f26327d.keyAt(i))).iterator();
                    while (it.hasNext()) {
                        ((C9385fZ0) ((InterfaceC10097l70) it.next())).m18258a();
                    }
                }
                this.f26327d.clear();
                this.f26326c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m17760c() {
        synchronized (this.f26324a) {
            this.f26328e = null;
        }
    }

    /* renamed from: d */
    public final void m17761d(InterfaceC10097l70 interfaceC10097l70) {
        synchronized (this.f26324a) {
            Image image = ((C9385fZ0) interfaceC10097l70).f27236b;
            LongSparseArray longSparseArray = this.f26327d;
            long timestamp = image.getTimestamp();
            List arrayList = (List) longSparseArray.get(timestamp);
            if (arrayList == null) {
                arrayList = new ArrayList();
                longSparseArray.put(timestamp, arrayList);
            }
            arrayList.add(interfaceC10097l70);
        }
        m17762e();
    }

    /* renamed from: e */
    public final void m17762e() {
        InterfaceC10097l70 interfaceC10097l70;
        TotalCaptureResult totalCaptureResult;
        synchronized (this.f26324a) {
            try {
                int size = this.f26325b.size() - 1;
                while (true) {
                    interfaceC10097l70 = null;
                    if (size < 0) {
                        totalCaptureResult = null;
                        break;
                    }
                    List list = (List) this.f26325b.valueAt(size);
                    if (!list.isEmpty()) {
                        totalCaptureResult = (TotalCaptureResult) list.get(0);
                        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        long jLongValue = l != null ? l.longValue() : -1L;
                        AbstractC9104dM1.m17550i(jLongValue == this.f26325b.keyAt(size), null);
                        List list2 = (List) this.f26327d.get(jLongValue);
                        if (list2 != null && !list2.isEmpty()) {
                            interfaceC10097l70 = (InterfaceC10097l70) list2.get(0);
                            LongSparseArray longSparseArray = this.f26327d;
                            List list3 = (List) longSparseArray.get(jLongValue);
                            if (list3 != null) {
                                list3.remove(interfaceC10097l70);
                                if (list3.isEmpty()) {
                                    longSparseArray.remove(jLongValue);
                                }
                            }
                            list.remove(totalCaptureResult);
                            if (list.isEmpty()) {
                                this.f26325b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                m17764g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC10097l70 == null || totalCaptureResult == null) {
            return;
        }
        m17763f(interfaceC10097l70, totalCaptureResult);
    }

    /* renamed from: f */
    public final void m17763f(InterfaceC10097l70 interfaceC10097l70, TotalCaptureResult totalCaptureResult) {
        InterfaceC3890cq interfaceC3890cq;
        Integer num;
        synchronized (this.f26324a) {
            try {
                interfaceC3890cq = this.f26328e;
                if (interfaceC3890cq != null) {
                    num = (Integer) this.f26326c.get(totalCaptureResult);
                } else {
                    ((C9385fZ0) interfaceC10097l70).m18258a();
                    interfaceC3890cq = null;
                    num = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC3890cq != null) {
            interfaceC3890cq.mo9925a(interfaceC10097l70, totalCaptureResult, num.intValue());
        }
    }

    /* renamed from: g */
    public final void m17764g() {
        synchronized (this.f26324a) {
            try {
                if (this.f26327d.size() != 0 && this.f26325b.size() != 0) {
                    long jKeyAt = this.f26327d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f26325b.keyAt(0);
                    AbstractC9104dM1.m17546e(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f26327d.size() - 1; size >= 0; size--) {
                            if (this.f26327d.keyAt(size) < jKeyAt2) {
                                Iterator it = ((List) this.f26327d.valueAt(size)).iterator();
                                while (it.hasNext()) {
                                    ((C9385fZ0) ((InterfaceC10097l70) it.next())).m18258a();
                                }
                                this.f26327d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f26325b.size() - 1; size2 >= 0; size2--) {
                            if (this.f26325b.keyAt(size2) < jKeyAt) {
                                this.f26325b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: h */
    public final void m17765h(InterfaceC3890cq interfaceC3890cq) {
        synchronized (this.f26324a) {
            this.f26328e = interfaceC3890cq;
        }
    }
}
