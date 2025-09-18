package io.sentry;

import io.sentry.clientreport.C5997a;
import io.sentry.config.AbstractC6003a;
import io.sentry.vendor.gson.stream.C6184a;
import io.sentry.vendor.gson.stream.EnumC6185b;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.k0 */
/* loaded from: classes2.dex */
public final class C6055k0 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f34220a = 0;

    /* renamed from: b */
    public final Object f34221b;

    public C6055k0(Reader reader) {
        this.f34221b = new C6184a(reader);
    }

    /* renamed from: A */
    public final Double m21803A() throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return Double.valueOf(c6184a.m21898W());
                }
                c6184a.m21903h0();
                return null;
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return Double.valueOf(((Number) objM21824r0).doubleValue());
                }
                return null;
        }
    }

    /* renamed from: D */
    public final float m21804D() throws IOException {
        switch (this.f34220a) {
            case 0:
                return (float) ((C6184a) this.f34221b).m21898W();
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return ((Number) objM21824r0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    /* renamed from: J */
    public final Float m21805J() throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return Float.valueOf(m21804D());
                }
                c6184a.m21903h0();
                return null;
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return Float.valueOf(((Number) objM21824r0).floatValue());
                }
                return null;
        }
    }

    /* renamed from: S */
    public final int m21806S() throws IOException {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21899X();
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return ((Number) objM21824r0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    /* renamed from: U */
    public final Integer m21807U() throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return Integer.valueOf(c6184a.m21899X());
                }
                c6184a.m21903h0();
                return null;
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return Integer.valueOf(((Number) objM21824r0).intValue());
                }
                return null;
        }
    }

    /* renamed from: W */
    public final ArrayList m21808W(ILogger iLogger, InterfaceC5826a0 interfaceC5826a0) throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() == EnumC6185b.NULL) {
                    c6184a.m21903h0();
                    return null;
                }
                c6184a.m21905m();
                ArrayList arrayList = new ArrayList();
                if (c6184a.m21894D()) {
                    do {
                        try {
                            arrayList.add(interfaceC5826a0.mo21493a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.mo21406d(EnumC6069n1.WARNING, "Failed to deserialize object in list.", e);
                        }
                    } while (c6184a.m21910o0() == EnumC6185b.BEGIN_OBJECT);
                }
                c6184a.m21917w();
                return arrayList;
            default:
                if (m21825s0() == EnumC6185b.NULL) {
                    m21814i0();
                    return null;
                }
                try {
                    m21815m();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
                    if (!arrayDeque.isEmpty()) {
                        do {
                            try {
                                arrayList2.add(interfaceC5826a0.mo21493a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.mo21406d(EnumC6069n1.WARNING, "Failed to deserialize object in list.", e2);
                            }
                        } while (m21825s0() == EnumC6185b.BEGIN_OBJECT);
                    }
                    if (arrayDeque.size() > 1) {
                        arrayDeque.removeLast();
                    }
                    return arrayList2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    /* renamed from: X */
    public final long m21809X() throws IOException {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21900b0();
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return ((Number) objM21824r0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    /* renamed from: b0 */
    public final Long m21810b0() throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return Long.valueOf(c6184a.m21900b0());
                }
                c6184a.m21903h0();
                return null;
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return Long.valueOf(((Number) objM21824r0).longValue());
                }
                return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f34220a) {
            case 0:
                ((C6184a) this.f34221b).close();
                break;
            default:
                ((ArrayDeque) this.f34221b).clear();
                break;
        }
    }

    /* renamed from: d0 */
    public final HashMap m21811d0(ILogger iLogger, C5997a c5997a) throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() == EnumC6185b.NULL) {
                    c6184a.m21903h0();
                    return null;
                }
                HashMap map = new HashMap();
                m21817n();
                if (c6184a.m21894D()) {
                    while (true) {
                        String strM21901d0 = c6184a.m21901d0();
                        ArrayList arrayListM21808W = m21808W(iLogger, c5997a);
                        if (arrayListM21808W != null) {
                            map.put(strM21901d0, arrayListM21808W);
                        }
                        if (c6184a.m21910o0() == EnumC6185b.BEGIN_OBJECT || c6184a.m21910o0() == EnumC6185b.NAME) {
                        }
                    }
                }
                m21819o();
                return map;
            default:
                if (m21825s0() == EnumC6185b.NULL) {
                    m21814i0();
                    return null;
                }
                HashMap map2 = new HashMap();
                try {
                    m21817n();
                    if (!((ArrayDeque) this.f34221b).isEmpty()) {
                        while (true) {
                            String strM21813h0 = m21813h0();
                            ArrayList arrayListM21808W2 = m21808W(iLogger, c5997a);
                            if (arrayListM21808W2 != null) {
                                map2.put(strM21813h0, arrayListM21808W2);
                            }
                            if (m21825s0() == EnumC6185b.BEGIN_OBJECT || m21825s0() == EnumC6185b.NAME) {
                            }
                        }
                    }
                    m21819o();
                    return map2;
                } catch (Exception e) {
                    throw new IOException(e);
                }
        }
    }

    /* renamed from: e0 */
    public final HashMap m21812e0(ILogger iLogger, InterfaceC5826a0 interfaceC5826a0) throws IOException {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() == EnumC6185b.NULL) {
                    c6184a.m21903h0();
                    return null;
                }
                c6184a.m21907n();
                HashMap map = new HashMap();
                if (c6184a.m21894D()) {
                    while (true) {
                        try {
                            map.put(c6184a.m21901d0(), interfaceC5826a0.mo21493a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.mo21406d(EnumC6069n1.WARNING, "Failed to deserialize object in map.", e);
                        }
                        if (c6184a.m21910o0() == EnumC6185b.BEGIN_OBJECT || c6184a.m21910o0() == EnumC6185b.NAME) {
                        }
                    }
                }
                c6184a.m21918x();
                return map;
            default:
                if (m21825s0() == EnumC6185b.NULL) {
                    m21814i0();
                    return null;
                }
                try {
                    m21817n();
                    HashMap map2 = new HashMap();
                    if (!((ArrayDeque) this.f34221b).isEmpty()) {
                        while (true) {
                            try {
                                map2.put(m21813h0(), interfaceC5826a0.mo21493a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.mo21406d(EnumC6069n1.WARNING, "Failed to deserialize object in map.", e2);
                            }
                            if (m21825s0() == EnumC6185b.BEGIN_OBJECT || m21825s0() == EnumC6185b.NAME) {
                            }
                        }
                    }
                    m21819o();
                    return map2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    /* renamed from: h0 */
    public final String m21813h0() throws IOException {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21901d0();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f34221b).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + m21825s0());
        }
    }

    /* renamed from: i0 */
    public void m21814i0() throws IOException {
        if (m21824r0() == null) {
            return;
        }
        throw new IOException("Expected null but was " + m21825s0());
    }

    /* renamed from: m */
    public void m21815m() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC6185b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    /* renamed from: m0 */
    public final Object m21816m0() {
        switch (this.f34220a) {
            case 0:
                C6052j0 c6052j0 = new C6052j0();
                c6052j0.m21798d(this);
                InterfaceC6013e0 interfaceC6013e0M21795a = c6052j0.m21795a();
                if (interfaceC6013e0M21795a != null) {
                    return interfaceC6013e0M21795a.getValue();
                }
                return null;
            default:
                return m21824r0();
        }
    }

    /* renamed from: n */
    public final void m21817n() throws IOException {
        switch (this.f34220a) {
            case 0:
                ((C6184a) this.f34221b).m21907n();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC6185b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    /* renamed from: n0 */
    public final Object m21818n0(ILogger iLogger, InterfaceC5826a0 interfaceC5826a0) {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return interfaceC5826a0.mo21493a(this, iLogger);
                }
                c6184a.m21903h0();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return interfaceC5826a0.mo21493a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    /* renamed from: o */
    public final void m21819o() {
        switch (this.f34220a) {
            case 0:
                ((C6184a) this.f34221b).m21918x();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    /* renamed from: o0 */
    public final String m21820o0() throws IOException {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21906m0();
            default:
                String str = (String) m21824r0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    /* renamed from: p */
    public final Boolean m21821p() {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return Boolean.valueOf(c6184a.m21897U());
                }
                c6184a.m21903h0();
                return null;
            default:
                return (Boolean) m21824r0();
        }
    }

    /* renamed from: p0 */
    public final String m21822p0() {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() != EnumC6185b.NULL) {
                    return c6184a.m21906m0();
                }
                c6184a.m21903h0();
                return null;
            default:
                return (String) m21824r0();
        }
    }

    /* renamed from: q0 */
    public final void m21823q0(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.f34220a) {
            case 0:
                try {
                    abstractMap.put(str, m21816m0());
                    break;
                } catch (Exception e) {
                    iLogger.mo21405c(EnumC6069n1.ERROR, e, "Error deserializing unknown key: %s", str);
                }
            default:
                try {
                    abstractMap.put(str, m21824r0());
                    break;
                } catch (Exception e2) {
                    iLogger.mo21405c(EnumC6069n1.ERROR, e2, "Error deserializing unknown key: %s", str);
                    return;
                }
        }
    }

    /* renamed from: r0 */
    public Object m21824r0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* renamed from: s0 */
    public final EnumC6185b m21825s0() {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21910o0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f34221b;
                if (arrayDeque.isEmpty()) {
                    return EnumC6185b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return EnumC6185b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return EnumC6185b.NAME;
                }
                Object value = entry.getValue();
                return value instanceof Map ? EnumC6185b.BEGIN_OBJECT : value instanceof List ? EnumC6185b.BEGIN_ARRAY : value instanceof String ? EnumC6185b.STRING : value instanceof Number ? EnumC6185b.NUMBER : value instanceof Boolean ? EnumC6185b.BOOLEAN : value instanceof EnumC6185b ? (EnumC6185b) value : EnumC6185b.END_DOCUMENT;
        }
    }

    /* renamed from: t0 */
    public final void m21826t0(boolean z) {
        switch (this.f34220a) {
            case 0:
                ((C6184a) this.f34221b).f34682b = z;
                break;
        }
    }

    /* renamed from: w */
    public final Date m21827w(ILogger iLogger) {
        switch (this.f34220a) {
            case 0:
                C6184a c6184a = (C6184a) this.f34221b;
                if (c6184a.m21910o0() == EnumC6185b.NULL) {
                    c6184a.m21903h0();
                    break;
                } else {
                    String strM21906m0 = c6184a.m21906m0();
                    if (strM21906m0 != null) {
                        try {
                            try {
                                break;
                            } catch (Exception e) {
                                iLogger.mo21406d(EnumC6069n1.ERROR, "Error when deserializing millis timestamp format.", e);
                                return null;
                            }
                        } catch (Exception unused) {
                            return AbstractC6003a.m21755n(strM21906m0);
                        }
                    }
                }
                break;
            default:
                String str = (String) m21824r0();
                if (str != null) {
                    try {
                        try {
                            break;
                        } catch (Exception unused2) {
                            return AbstractC6003a.m21755n(str);
                        }
                    } catch (Exception e2) {
                        iLogger.mo21406d(EnumC6069n1.ERROR, "Error when deserializing millis timestamp format.", e2);
                        return null;
                    }
                }
                break;
        }
        return null;
    }

    /* renamed from: x */
    public final double m21828x() throws IOException {
        switch (this.f34220a) {
            case 0:
                return ((C6184a) this.f34221b).m21898W();
            default:
                Object objM21824r0 = m21824r0();
                if (objM21824r0 instanceof Number) {
                    return ((Number) objM21824r0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public C6055k0(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f34221b = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    /* renamed from: v0 */
    private final void m21802v0() {
    }

    /* renamed from: u0 */
    private final void m21801u0(boolean z) {
    }
}
