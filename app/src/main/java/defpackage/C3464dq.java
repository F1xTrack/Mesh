package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3464dq {
    public final Object a = new Object();
    public final LongSparseArray b = new LongSparseArray();
    public final HashMap c = new HashMap();
    public final LongSparseArray d = new LongSparseArray();
    public InterfaceC3274cq e;

    public final void a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.a) {
            try {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long jLongValue = l != null ? l.longValue() : -1L;
                if (jLongValue == -1) {
                    return;
                }
                LongSparseArray longSparseArray = this.b;
                List arrayList = (List) longSparseArray.get(jLongValue);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    longSparseArray.put(jLongValue, arrayList);
                }
                arrayList.add(totalCaptureResult);
                this.c.put(totalCaptureResult, Integer.valueOf(i));
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                this.b.clear();
                for (int i = 0; i < this.d.size(); i++) {
                    Iterator it = ((List) this.d.get(this.d.keyAt(i))).iterator();
                    while (it.hasNext()) {
                        ((C3796fZ0) ((InterfaceC5634l70) it.next())).a();
                    }
                }
                this.d.clear();
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.e = null;
        }
    }

    public final void d(InterfaceC5634l70 interfaceC5634l70) {
        synchronized (this.a) {
            Image image = ((C3796fZ0) interfaceC5634l70).b;
            LongSparseArray longSparseArray = this.d;
            long timestamp = image.getTimestamp();
            List arrayList = (List) longSparseArray.get(timestamp);
            if (arrayList == null) {
                arrayList = new ArrayList();
                longSparseArray.put(timestamp, arrayList);
            }
            arrayList.add(interfaceC5634l70);
        }
        e();
    }

    public final void e() {
        InterfaceC5634l70 interfaceC5634l70;
        TotalCaptureResult totalCaptureResult;
        synchronized (this.a) {
            try {
                int size = this.b.size() - 1;
                while (true) {
                    interfaceC5634l70 = null;
                    if (size < 0) {
                        totalCaptureResult = null;
                        break;
                    }
                    List list = (List) this.b.valueAt(size);
                    if (!list.isEmpty()) {
                        totalCaptureResult = (TotalCaptureResult) list.get(0);
                        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        long jLongValue = l != null ? l.longValue() : -1L;
                        AbstractC3377dM1.i(jLongValue == this.b.keyAt(size), null);
                        List list2 = (List) this.d.get(jLongValue);
                        if (list2 != null && !list2.isEmpty()) {
                            interfaceC5634l70 = (InterfaceC5634l70) list2.get(0);
                            LongSparseArray longSparseArray = this.d;
                            List list3 = (List) longSparseArray.get(jLongValue);
                            if (list3 != null) {
                                list3.remove(interfaceC5634l70);
                                if (list3.isEmpty()) {
                                    longSparseArray.remove(jLongValue);
                                }
                            }
                            list.remove(totalCaptureResult);
                            if (list.isEmpty()) {
                                this.b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC5634l70 == null || totalCaptureResult == null) {
            return;
        }
        f(interfaceC5634l70, totalCaptureResult);
    }

    public final void f(InterfaceC5634l70 interfaceC5634l70, TotalCaptureResult totalCaptureResult) {
        InterfaceC3274cq interfaceC3274cq;
        Integer num;
        synchronized (this.a) {
            try {
                interfaceC3274cq = this.e;
                if (interfaceC3274cq != null) {
                    num = (Integer) this.c.get(totalCaptureResult);
                } else {
                    ((C3796fZ0) interfaceC5634l70).a();
                    interfaceC3274cq = null;
                    num = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC3274cq != null) {
            interfaceC3274cq.a(interfaceC5634l70, totalCaptureResult, num.intValue());
        }
    }

    public final void g() {
        synchronized (this.a) {
            try {
                if (this.d.size() != 0 && this.b.size() != 0) {
                    long jKeyAt = this.d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.b.keyAt(0);
                    AbstractC3377dM1.e(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.d.size() - 1; size >= 0; size--) {
                            if (this.d.keyAt(size) < jKeyAt2) {
                                Iterator it = ((List) this.d.valueAt(size)).iterator();
                                while (it.hasNext()) {
                                    ((C3796fZ0) ((InterfaceC5634l70) it.next())).a();
                                }
                                this.d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
                            if (this.b.keyAt(size2) < jKeyAt) {
                                this.b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void h(InterfaceC3274cq interfaceC3274cq) {
        synchronized (this.a) {
            this.e = interfaceC3274cq;
        }
    }
}
