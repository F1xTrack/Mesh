package defpackage;

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
public final class C6082nT0 {
    public final Context a;
    public final Class b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public Executor g;
    public Executor h;
    public C1286Qg0 i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean m;
    public final long n;
    public final C6273oT0 o;
    public final LinkedHashSet p;
    public HashSet q;

    public C6082nT0(Context context, String str, Class cls) {
        O90.f(context, "context");
        this.a = context;
        this.b = cls;
        this.c = str;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.k = 1;
        this.l = true;
        this.n = -1L;
        C6273oT0 c6273oT0 = new C6273oT0();
        c6273oT0.a = new LinkedHashMap();
        this.o = c6273oT0;
        this.p = new LinkedHashSet();
    }

    public final void a(AbstractC1631Ur0... abstractC1631Ur0Arr) {
        if (this.q == null) {
            this.q = new HashSet();
        }
        for (AbstractC1631Ur0 abstractC1631Ur0 : abstractC1631Ur0Arr) {
            HashSet hashSet = this.q;
            O90.c(hashSet);
            hashSet.add(Integer.valueOf(abstractC1631Ur0.a));
            HashSet hashSet2 = this.q;
            O90.c(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC1631Ur0.b));
        }
        this.o.m((AbstractC1631Ur0[]) Arrays.copyOf(abstractC1631Ur0Arr, abstractC1631Ur0Arr.length));
    }

    public final AbstractC6464pT0 b() throws ClassNotFoundException {
        int i;
        boolean zContainsKey;
        Executor executor = this.g;
        if (executor == null && this.h == null) {
            ExecutorC4096h8 executorC4096h8 = C4287i8.c;
            this.h = executorC4096h8;
            this.g = executorC4096h8;
        } else if (executor != null && this.h == null) {
            this.h = executor;
        } else if (executor == null) {
            this.g = this.h;
        }
        HashSet hashSet = this.q;
        LinkedHashSet linkedHashSet = this.p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC7209tN0.u(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        C61 c0474Fv0 = this.i;
        if (c0474Fv0 == null) {
            c0474Fv0 = new C0474Fv0(14);
        }
        C61 c61 = c0474Fv0;
        if (this.n > 0) {
            if (this.c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.d;
        boolean z = this.j;
        int i2 = this.k;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.a;
        O90.f(context, "context");
        if (i2 != 1) {
            i = i2;
        } else {
            Object systemService = context.getSystemService("activity");
            O90.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (((ActivityManager) systemService).isLowRamDevice()) {
                i2 = 2;
                i = i2;
            } else {
                i = 3;
            }
        }
        Executor executor2 = this.g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C5651lD c5651lD = new C5651lD(context, this.c, c61, this.o, arrayList, z, i, executor2, executor3, this.l, this.m, linkedHashSet, this.e, this.f);
        Class cls = this.b;
        Package r5 = cls.getPackage();
        O90.c(r5);
        String name = r5.getName();
        String canonicalName = cls.getCanonicalName();
        O90.c(canonicalName);
        O90.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            O90.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = D51.l(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader());
            O90.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            AbstractC6464pT0 abstractC6464pT0 = (AbstractC6464pT0) cls2.newInstance();
            abstractC6464pT0.getClass();
            abstractC6464pT0.c = abstractC6464pT0.e(c5651lD);
            Set setH = abstractC6464pT0.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = abstractC6464pT0.g;
                ArrayList arrayList2 = c5651lD.n;
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
                    for (AbstractC1631Ur0 abstractC1631Ur0 : abstractC6464pT0.f(linkedHashMap)) {
                        int i5 = abstractC1631Ur0.a;
                        C6273oT0 c6273oT0 = c5651lD.d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c6273oT0.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                            if (map == null) {
                                map = NN.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC1631Ur0.b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c6273oT0.m(abstractC1631Ur0);
                        }
                    }
                    abstractC6464pT0.g().setWriteAheadLoggingEnabled(c5651lD.g == 3);
                    abstractC6464pT0.f = c5651lD.e;
                    abstractC6464pT0.b = c5651lD.h;
                    O90.f(c5651lD.i, "executor");
                    new ArrayDeque();
                    abstractC6464pT0.e = c5651lD.f;
                    Map mapI = abstractC6464pT0.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c5651lD.m;
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
                            return abstractC6464pT0;
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
                            abstractC6464pT0.j.put(cls5, arrayList3.get(size4));
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
