package defpackage;

import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.data.source.ManifestDataSource;
import expo.modules.adapters.react.NativeModulesProxy;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* renamed from: qd0 */
/* loaded from: classes2.dex */
public final class C6685qd0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6685qd0(int i, Object obj) {
        super(0);
        this.e = i;
        this.f = obj;
    }

    private final Object a() {
        File file = (File) ((I11) this.f).a.invoke();
        String absolutePath = file.getAbsolutePath();
        synchronized (I11.j) {
            LinkedHashSet linkedHashSet = I11.i;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            O90.e(absolutePath, "it");
            linkedHashSet.add(absolutePath);
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, nZ] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Object obj;
        C0387Es0 next;
        C1121Od0 c1121Od0;
        NativeModulesProxy nativeModulesProxy;
        Object next2;
        Object next3;
        InterfaceC6878re0 interfaceC6878re0;
        Pair pair;
        Object next4;
        switch (this.e) {
            case 0:
                C6875rd0 c6875rd0 = (C6875rd0) this.f;
                Collection collectionValues = ((Map) WS1.b(c6875rd0.c.j, C0432Fh0.n[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    SI siA = ((LI) ((C4375ib0) c6875rd0.b.b).d).a(c6875rd0.c, (C7977xP0) it.next());
                    if (siA != null) {
                        arrayList.add(siA);
                    }
                }
                return (InterfaceC5578kq0[]) AbstractC6840rR1.f(arrayList).toArray(new InterfaceC5578kq0[0]);
            case 1:
                return AbstractC8254ys0.a(((AbstractC6497pe0) this.f).b());
            case 2:
                return new C8402ze0((C0033Ae0) this.f);
            case 3:
                return new C0267De0((C0345Ee0) this.f);
            case 4:
                return new C0423Fe0((C0501Ge0) this.f);
            case 5:
                List upperBounds = ((C8215yf0) this.f).a.getUpperBounds();
                O90.e(upperBounds, "getUpperBounds(...)");
                List list = upperBounds;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C7835wf0((AbstractC0663Ig0) it2.next(), null));
                }
                return arrayList2;
            case 6:
                return Float.valueOf(((C5826m71) this.f).i().d);
            case 7:
                return new C1907Yf0((C2226aw) this.f);
            case 8:
                InterfaceC5578kq0 interfaceC5578kq0 = (InterfaceC5578kq0) ((InterfaceC5908mZ) this.f).invoke();
                return interfaceC5578kq0 instanceof C1913Yh0 ? ((C1913Yh0) interfaceC5578kq0).h() : interfaceC5578kq0;
            case 9:
                return ManifestDataSource.access$getMetaDataBundle((ManifestDataSource) this.f);
            case 10:
                AbstractC7874ws0 abstractC7874ws0 = (AbstractC7874ws0) this.f;
                C7 c7B = abstractC7874ws0.b();
                try {
                    obj = c7B.a.a.get(InterfaceC8356zP.class);
                } catch (Exception unused) {
                    obj = null;
                }
                InterfaceC8356zP interfaceC8356zP = (InterfaceC8356zP) obj;
                if (interfaceC8356zP == null) {
                    return null;
                }
                C0699Is0 c0699Is0 = c7B.c;
                c0699Is0.getClass();
                Iterator it3 = c0699Is0.b.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((C0387Es0) next).a == abstractC7874ws0) {
                        }
                    } else {
                        next = 0;
                    }
                }
                C0387Es0 c0387Es0 = next instanceof C0387Es0 ? next : null;
                if (c0387Es0 != null) {
                    return new C7642ve0(c0387Es0, interfaceC8356zP, c7B.b);
                }
                throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.");
            case 11:
                C0867Kw0 c0867Kw0 = (C0867Kw0) this.f;
                synchronized (c0867Kw0.c) {
                    try {
                        c1121Od0 = c0867Kw0.a.a;
                        if (c1121Od0 == null) {
                            C7691vu1 c7691vu1A = c0867Kw0.b.a();
                            c1121Od0 = c7691vu1A != null ? new C1121Od0(new RemoteConfig(c7691vu1A.b), c7691vu1A.d) : null;
                            c0867Kw0.a.a = c1121Od0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1121Od0;
            case 12:
                WeakReference weakReference = ((C6736qu0) this.f).b().n;
                Map<String, Object> constants = (weakReference == null || (nativeModulesProxy = (NativeModulesProxy) weakReference.get()) == null) ? null : nativeModulesProxy.getConstants();
                return constants == null ? NN.a : constants;
            case 13:
                InterfaceC5908mZ interfaceC5908mZ = ((C6548pv0) this.f).b;
                if (interfaceC5908mZ != null) {
                    return (List) interfaceC5908mZ.invoke();
                }
                return null;
            case 14:
                Pair[] pairArr = (Pair[]) this.f;
                int length = pairArr.length;
                if (length == 0) {
                    return NN.a;
                }
                if (length == 1) {
                    return AbstractC7287tn0.c(pairArr[0]);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(pairArr.length));
                AbstractC7096sn0.l(linkedHashMap, pairArr);
                return linkedHashMap;
            case 15:
                PersistableConfigSyncJobService persistableConfigSyncJobService = (PersistableConfigSyncJobService) this.f;
                int iInvoke = persistableConfigSyncJobService.a.invoke();
                if (iInvoke == 0) {
                    throw null;
                }
                int i = iInvoke - 1;
                InterfaceC6646qQ0 interfaceC6646qQ0 = persistableConfigSyncJobService.b;
                if (i != 1) {
                    if (i == 2) {
                    }
                    return C1518Tf1.a;
                }
                interfaceC6646qQ0.b();
                interfaceC6646qQ0.d();
                return C1518Tf1.a;
            case 16:
                C6818rK0 c6818rK0 = (C6818rK0) this.f;
                if (c6818rK0.x) {
                    c6818rK0.J();
                }
                return C1518Tf1.a;
            case 17:
                File file = (File) ((C7726w5) this.f).invoke();
                String name = file.getName();
                O90.e(name, "getName(...)");
                if (AbstractC7538v51.U('.', name, "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 18:
                E20 e20 = ((FN0) this.f).e;
                O90.c(e20);
                List<Certificate> listA = e20.a();
                ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(listA));
                for (Certificate certificate : listA) {
                    O90.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList3.add((X509Certificate) certificate);
                }
                return arrayList3;
            case 19:
                TN0 tn0 = (TN0) this.f;
                InterfaceC4384ie0 interfaceC4384ie0I = tn0.d.i();
                O90.d(interfaceC4384ie0I, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                ArrayList arrayListA = U22.a((InterfaceC1667Vd0) interfaceC4384ie0I);
                ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayListA));
                Iterator it4 = arrayListA.iterator();
                while (it4.hasNext()) {
                    InterfaceC3433df0 interfaceC3433df0 = (InterfaceC3433df0) it4.next();
                    Iterator it5 = interfaceC3433df0.getAnnotations().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            if (((Annotation) next2) instanceof InterfaceC2330bT) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    InterfaceC2330bT interfaceC2330bT = (InterfaceC2330bT) next2;
                    if (interfaceC2330bT == null) {
                        pair = null;
                    } else {
                        AbstractC1512Td1 abstractC1512Td1B = tn0.c.b(interfaceC3433df0.getReturnType());
                        Iterator it6 = interfaceC3433df0.getAnnotations().iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next3 = it6.next();
                                if (((Annotation) next3) instanceof XR0) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        boolean z = false;
                        boolean z2 = ((XR0) next3) != null;
                        List<Annotation> annotations = interfaceC3433df0.getAnnotations();
                        ArrayList arrayList5 = new ArrayList(AbstractC8449zu.k(annotations));
                        for (Annotation annotation : annotations) {
                            Iterator it7 = P22.a(annotation).getAnnotations().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    next4 = it7.next();
                                    if (((Annotation) next4) instanceof InterfaceC7459uh) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            InterfaceC7459uh interfaceC7459uh = (InterfaceC7459uh) next4;
                            arrayList5.add(interfaceC7459uh == null ? null : new Pair(annotation, interfaceC7459uh));
                        }
                        List listY = AbstractC8069xu.y(arrayList5);
                        ArrayList arrayList6 = new ArrayList(AbstractC8449zu.k(listY));
                        Iterator it8 = listY.iterator();
                        if (it8.hasNext()) {
                            Pair pair2 = (Pair) it8.next();
                            InterfaceC1667Vd0 interfaceC1667Vd0B = BP0.a.b(((InterfaceC7459uh) pair2.b).binder());
                            Iterator it9 = interfaceC1667Vd0B.g().iterator();
                            InterfaceC6878re0 interfaceC6878re02 = null;
                            while (true) {
                                if (it9.hasNext()) {
                                    ?? next5 = it9.next();
                                    List parameters = ((InterfaceC6878re0) next5).getParameters();
                                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                                        Iterator it10 = parameters.iterator();
                                        while (it10.hasNext()) {
                                            if (!((C1514Te0) ((InterfaceC1280Qe0) it10.next())).m()) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        interfaceC6878re02 = next5;
                                        z = true;
                                    }
                                } else if (z) {
                                    interfaceC6878re0 = interfaceC6878re02;
                                }
                            }
                            interfaceC6878re0 = null;
                            InterfaceC6878re0 interfaceC6878re03 = interfaceC6878re0;
                            if (interfaceC6878re03 != null) {
                                O90.d(interfaceC6878re03.callBy(NN.a), "null cannot be cast to non-null type expo.modules.kotlin.records.ValidationBinder");
                                throw new ClassCastException();
                            }
                            throw new IllegalArgumentException("Class should have a single no-arg constructor: " + interfaceC1667Vd0B);
                        }
                        pair = new Pair(interfaceC3433df0, new SN0(abstractC1512Td1B, interfaceC2330bT, z2, arrayList6));
                    }
                    arrayList4.add(pair);
                }
                return AbstractC7096sn0.n(AbstractC8069xu.y(arrayList4));
            case 20:
                RemoteMessage remoteMessage = (RemoteMessage) this.f;
                RandomAccess stringArrayList = remoteMessage.a.getStringArrayList("vk.data_key");
                RandomAccess randomAccess = MN.a;
                if (stringArrayList == null) {
                    stringArrayList = randomAccess;
                }
                RandomAccess stringArrayList2 = remoteMessage.a.getStringArrayList("vk.data_value");
                if (stringArrayList2 != null) {
                    randomAccess = stringArrayList2;
                }
                return AbstractC7096sn0.n(AbstractC8069xu.i0((Iterable) stringArrayList, (Iterable) randomAccess));
            case 21:
                return new FZ0((InterfaceC3729fD) this.f);
            case 22:
                return LB1.c((InterfaceC2001Zk1) this.f);
            case 23:
                return (InterfaceC5578kq0) ((KV0) this.f).b.invoke(C1130Og0.a);
            case 24:
                C7621vX0 c7621vX0 = (C7621vX0) this.f;
                c7621vX0.f = new X11(c7621vX0.j(), c7621vX0.b().a);
                c7621vX0.e = new C3513e41(c7621vX0.j(), c7621vX0.c);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                c7621vX0.d = keyStore;
                return C1518Tf1.a;
            case 25:
                return this.f;
            case 26:
                return ((AbstractC0447Fm0) this.f).c();
            case 27:
                return a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return QS1.b((InterfaceC5925me1) ((C6962s41) this.f).b);
            default:
                T51 t51 = (T51) this.f;
                return t51.i(AbstractC8171yQ1.a(t51.b, null, 3));
        }
    }
}
