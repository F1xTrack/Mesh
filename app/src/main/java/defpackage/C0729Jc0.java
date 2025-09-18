package defpackage;

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
public final class C0729Jc0 implements InterfaceC1880Xw0, InterfaceC1446Sh1 {
    public final boolean a = true;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final C5536kc0 e;
    public final boolean f;

    public C0729Jc0(Writer writer, HashMap map, HashMap map2, C5536kc0 c5536kc0, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = c5536kc0;
        this.f = z;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 a(C2520cT c2520cT, Object obj) throws IOException {
        h(obj, c2520cT.a);
        return this;
    }

    @Override // defpackage.InterfaceC1446Sh1
    public final InterfaceC1446Sh1 add(boolean z) throws IOException {
        i();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC1446Sh1
    public final InterfaceC1446Sh1 b(String str) throws IOException {
        i();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 c(C2520cT c2520cT, boolean z) throws IOException {
        String str = c2520cT.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 d(C2520cT c2520cT, int i) throws IOException {
        String str = c2520cT.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 e(C2520cT c2520cT, double d) throws IOException {
        String str = c2520cT.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 f(C2520cT c2520cT, long j) throws IOException {
        String str = c2520cT.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j);
        return this;
    }

    public final C0729Jc0 g(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.b;
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
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C8163yO(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1802Ww0 interfaceC1802Ww0 = (InterfaceC1802Ww0) this.c.get(obj.getClass());
            if (interfaceC1802Ww0 != null) {
                jsonWriter.beginObject();
                interfaceC1802Ww0.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1368Rh1 interfaceC1368Rh1 = (InterfaceC1368Rh1) this.d.get(obj.getClass());
            if (interfaceC1368Rh1 != null) {
                interfaceC1368Rh1.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                throw null;
            }
            if (obj instanceof InterfaceC0789Jw0) {
                int iA = ((InterfaceC0789Jw0) obj).a();
                i();
                jsonWriter.value(iA);
            } else {
                String strName = ((Enum) obj).name();
                i();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            i();
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
                i();
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
                g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final C0729Jc0 h(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj != null) {
                i();
                jsonWriter.name(str);
                g(obj);
            }
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            g(obj);
        }
        return this;
    }

    public final void i() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
