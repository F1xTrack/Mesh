package p000;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: nT0 */
/* loaded from: classes.dex */
public final class C10397nT0 {

    /* renamed from: a */
    public final Context f38314a;

    /* renamed from: b */
    public final Class f38315b;

    /* renamed from: c */
    public final String f38316c;

    /* renamed from: d */
    public final ArrayList f38317d;

    /* renamed from: e */
    public final ArrayList f38318e;

    /* renamed from: f */
    public final ArrayList f38319f;

    /* renamed from: g */
    public Executor f38320g;

    /* renamed from: h */
    public Executor f38321h;

    /* renamed from: i */
    public C8158Qg0 f38322i;

    /* renamed from: j */
    public boolean f38323j;

    /* renamed from: k */
    public final int f38324k;

    /* renamed from: l */
    public boolean f38325l;

    /* renamed from: m */
    public boolean f38326m;

    /* renamed from: n */
    public final long f38327n;

    /* renamed from: o */
    public final C10525oT0 f38328o;

    /* renamed from: p */
    public final LinkedHashSet f38329p;

    /* renamed from: q */
    public HashSet f38330q;

    public C10397nT0(Context context, String str, Class cls) {
        O90.m5968f(context, "context");
        this.f38314a = context;
        this.f38315b = cls;
        this.f38316c = str;
        this.f38317d = new ArrayList();
        this.f38318e = new ArrayList();
        this.f38319f = new ArrayList();
        this.f38324k = 1;
        this.f38325l = true;
        this.f38327n = -1L;
        C10525oT0 c10525oT0 = new C10525oT0();
        c10525oT0.f39025a = new LinkedHashMap();
        this.f38328o = c10525oT0;
        this.f38329p = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void m23150a(AbstractC8388Ur0... abstractC8388Ur0Arr) {
        if (this.f38330q == null) {
            this.f38330q = new HashSet();
        }
        for (AbstractC8388Ur0 abstractC8388Ur0 : abstractC8388Ur0Arr) {
            HashSet hashSet = this.f38330q;
            O90.m5965c(hashSet);
            hashSet.add(Integer.valueOf(abstractC8388Ur0.f12174a));
            HashSet hashSet2 = this.f38330q;
            O90.m5965c(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC8388Ur0.f12175b));
        }
        this.f38328o.m23427m((AbstractC8388Ur0[]) Arrays.copyOf(abstractC8388Ur0Arr, abstractC8388Ur0Arr.length));
    }

    /* renamed from: b */
    public final AbstractC10653pT0 m23151b() throws ClassNotFoundException {
        int i;
        boolean zContainsKey;
        Executor executor = this.f38320g;
        if (executor == null && this.f38321h == null) {
            ExecutorC4160h8 executorC4160h8 = C4223i8.f28831c;
            this.f38321h = executorC4160h8;
            this.f38320g = executorC4160h8;
        } else if (executor != null && this.f38321h == null) {
            this.f38321h = executor;
        } else if (executor == null) {
            this.f38320g = this.f38321h;
        }
        HashSet hashSet = this.f38330q;
        LinkedHashSet linkedHashSet = this.f38329p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        C61 c7616Fv0 = this.f38322i;
        if (c7616Fv0 == null) {
            c7616Fv0 = new C7616Fv0(14);
        }
        C61 c61 = c7616Fv0;
        if (this.f38327n > 0) {
            if (this.f38316c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f38317d;
        boolean z = this.f38323j;
        int i2 = this.f38324k;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.f38314a;
        O90.m5968f(context, "context");
        if (i2 != 1) {
            i = i2;
        } else {
            Object systemService = context.getSystemService("activity");
            O90.m5966d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (((ActivityManager) systemService).isLowRamDevice()) {
                i2 = 2;
                i = i2;
            } else {
                i = 3;
            }
        }
        Executor executor2 = this.f38320g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f38321h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C6349lD c6349lD = new C6349lD(context, this.f38316c, c61, this.f38328o, arrayList, z, i, executor2, executor3, this.f38325l, this.f38326m, linkedHashSet, this.f38318e, this.f38319f);
        Class cls = this.f38315b;
        Package r5 = cls.getPackage();
        O90.m5965c(r5);
        String name = r5.getName();
        String canonicalName = cls.getCanonicalName();
        O90.m5965c(canonicalName);
        O90.m5967e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            O90.m5967e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = D51.m1553l(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader());
            O90.m5966d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            AbstractC10653pT0 abstractC10653pT0 = (AbstractC10653pT0) cls2.newInstance();
            abstractC10653pT0.getClass();
            abstractC10653pT0.f40095c = abstractC10653pT0.mo10331e(c6349lD);
            Set setMo10333h = abstractC10653pT0.mo10333h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setMo10333h.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = abstractC10653pT0.f40099g;
                ArrayList arrayList2 = c6349lD.f36973n;
                if (zHasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            if (cls3.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                        size = -1;
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls3, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                        }
                    }
                    for (AbstractC8388Ur0 abstractC8388Ur0 : abstractC10653pT0.mo10332f(linkedHashMap)) {
                        int i5 = abstractC8388Ur0.f12174a;
                        C10525oT0 c10525oT0 = c6349lD.f36963d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c10525oT0.f39025a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                            if (map == null) {
                                map = C0842NN.f7735a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC8388Ur0.f12175b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c10525oT0.m23427m(abstractC8388Ur0);
                        }
                    }
                    abstractC10653pT0.m23794g().setWriteAheadLoggingEnabled(c6349lD.f36966g == 3);
                    abstractC10653pT0.f40098f = c6349lD.f36964e;
                    abstractC10653pT0.f40094b = c6349lD.f36967h;
                    O90.m5968f(c6349lD.f36968i, "executor");
                    new ArrayDeque();
                    abstractC10653pT0.f40097e = c6349lD.f36965f;
                    Map mapMo10334i = abstractC10653pT0.mo10334i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapMo10334i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c6349lD.f36972m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i6 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i6 < 0) {
                                        break;
                                    }
                                    size3 = i6;
                                }
                            }
                            return abstractC10653pT0;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                }
                            } else {
                                size4 = -1;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            abstractC10653pT0.f40102j.put(cls5, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }
}
