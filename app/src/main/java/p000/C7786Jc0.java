package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Jc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7786Jc0 implements InterfaceC8554Xw0, InterfaceC8265Sh1 {

    /* renamed from: a */
    public final boolean f5638a = true;

    /* renamed from: b */
    public final JsonWriter f5639b;

    /* renamed from: c */
    public final HashMap f5640c;

    /* renamed from: d */
    public final HashMap f5641d;

    /* renamed from: e */
    public final C10031kc0 f5642e;

    /* renamed from: f */
    public final boolean f5643f;

    public C7786Jc0(Writer writer, HashMap map, HashMap map2, C10031kc0 c10031kc0, boolean z) {
        this.f5639b = new JsonWriter(writer);
        this.f5640c = map;
        this.f5641d = map2;
        this.f5642e = c10031kc0;
        this.f5643f = z;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: a */
    public final InterfaceC8554Xw0 mo4359a(C1849cT c1849cT, Object obj) throws IOException {
        m4366h(obj, c1849cT.f17529a);
        return this;
    }

    @Override // p000.InterfaceC8265Sh1
    public final InterfaceC8265Sh1 add(boolean z) throws IOException {
        m4367i();
        this.f5639b.value(z);
        return this;
    }

    @Override // p000.InterfaceC8265Sh1
    /* renamed from: b */
    public final InterfaceC8265Sh1 mo4360b(String str) throws IOException {
        m4367i();
        this.f5639b.value(str);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: c */
    public final InterfaceC8554Xw0 mo4361c(C1849cT c1849cT, boolean z) throws IOException {
        String str = c1849cT.f17529a;
        m4367i();
        JsonWriter jsonWriter = this.f5639b;
        jsonWriter.name(str);
        m4367i();
        jsonWriter.value(z);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: d */
    public final InterfaceC8554Xw0 mo4362d(C1849cT c1849cT, int i) throws IOException {
        String str = c1849cT.f17529a;
        m4367i();
        JsonWriter jsonWriter = this.f5639b;
        jsonWriter.name(str);
        m4367i();
        jsonWriter.value(i);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: e */
    public final InterfaceC8554Xw0 mo4363e(C1849cT c1849cT, double d) throws IOException {
        String str = c1849cT.f17529a;
        m4367i();
        JsonWriter jsonWriter = this.f5639b;
        jsonWriter.name(str);
        m4367i();
        jsonWriter.value(d);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: f */
    public final InterfaceC8554Xw0 mo4364f(C1849cT c1849cT, long j) throws IOException {
        String str = c1849cT.f17529a;
        m4367i();
        JsonWriter jsonWriter = this.f5639b;
        jsonWriter.name(str);
        m4367i();
        jsonWriter.value(j);
        return this;
    }

    /* renamed from: g */
    public final C7786Jc0 m4365g(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.f5639b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m4365g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m4366h(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C7198yO(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC8502Ww0 interfaceC8502Ww0 = (InterfaceC8502Ww0) this.f5640c.get(obj.getClass());
            if (interfaceC8502Ww0 != null) {
                jsonWriter.beginObject();
                interfaceC8502Ww0.mo104a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC8213Rh1 interfaceC8213Rh1 = (InterfaceC8213Rh1) this.f5641d.get(obj.getClass());
            if (interfaceC8213Rh1 != null) {
                interfaceC8213Rh1.mo104a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f5642e.mo104a(obj, this);
                throw null;
            }
            if (obj instanceof InterfaceC7826Jw0) {
                int iMo2970a = ((InterfaceC7826Jw0) obj).mo2970a();
                m4367i();
                jsonWriter.value(iMo2970a);
            } else {
                String strName = ((Enum) obj).name();
                m4367i();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            m4367i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r8[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m4367i();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m4365g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m4365g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* renamed from: h */
    public final C7786Jc0 m4366h(Object obj, String str) throws IOException {
        boolean z = this.f5643f;
        JsonWriter jsonWriter = this.f5639b;
        if (z) {
            if (obj != null) {
                m4367i();
                jsonWriter.name(str);
                m4365g(obj);
            }
            return this;
        }
        m4367i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            m4365g(obj);
        }
        return this;
    }

    /* renamed from: i */
    public final void m4367i() {
        if (!this.f5638a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
