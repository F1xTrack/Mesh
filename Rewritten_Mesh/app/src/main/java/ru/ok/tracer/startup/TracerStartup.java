package ru.ok.tracer.startup;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.AbstractC8259yu;
import defpackage.C6512pj0;
import defpackage.D51;
import defpackage.O90;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.utils.Logger;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\r2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0013\u001a\u00020\u00062\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/tracer/startup/TracerStartup;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LTf1;", "init", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "Lru/ok/tracer/startup/Initializer;", "initializerClasses", "", "orderInitializers", "(Ljava/util/Collection;)Ljava/util/List;", "", "orderedInitializers", "initializerClass", "orderInitializersInto", "(Ljava/util/List;Ljava/lang/Class;)V", "", "META_DATA_PREFIX", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReference;", "prevAppContext", "Ljava/util/concurrent/atomic/AtomicReference;", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerStartup {
    private static final String META_DATA_PREFIX = "ru.ok.tracer.startup.Initializer@";
    public static final TracerStartup INSTANCE = new TracerStartup();
    private static final AtomicReference<Context> prevAppContext = new AtomicReference<>();

    private TracerStartup() {
    }

    public static final void init(Context context) {
        String string;
        O90.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("applicationContext required");
        }
        AtomicReference<Context> atomicReference = prevAppContext;
        while (!atomicReference.compareAndSet(null, applicationContext)) {
            if (atomicReference.get() != null) {
                if (applicationContext != prevAppContext.get()) {
                    throw new IllegalStateException("Trying to initialize again with different app context");
                }
                return;
            }
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        O90.e(packageManager, "appContext\n            .packageManager");
        String packageName = applicationContext.getPackageName();
        O90.e(packageName, "appContext.packageName");
        Bundle bundle = PackageManagerCompat.getApplicationInfoCompat(packageManager, packageName, 128).metaData;
        C6512pj0 c6512pj0C = AbstractC8259yu.c();
        for (String str : bundle.keySet()) {
            O90.e(str, "key");
            if (D51.o(str, META_DATA_PREFIX, false) && (string = bundle.getString(str)) != null) {
                c6512pj0C.add(Class.forName(string));
            }
        }
        C6512pj0 c6512pj0B = AbstractC8259yu.b(c6512pj0C);
        if (c6512pj0B.isEmpty()) {
            Logger.e$default("Couldn't find initializer classes. Did you remove it from manifest", null, 2, null);
            return;
        }
        Iterator<T> it = INSTANCE.orderInitializers(c6512pj0B).iterator();
        while (it.hasNext()) {
            ((Initializer) it.next()).create(applicationContext);
        }
    }

    private final List<Initializer<?>> orderInitializers(Collection<? extends Class<? extends Initializer<?>>> initializerClasses) throws IllegalAccessException, InstantiationException {
        C6512pj0 c6512pj0 = new C6512pj0(initializerClasses.size());
        Iterator<? extends Class<? extends Initializer<?>>> it = initializerClasses.iterator();
        while (it.hasNext()) {
            INSTANCE.orderInitializersInto(c6512pj0, it.next());
        }
        return AbstractC8259yu.b(c6512pj0);
    }

    private final void orderInitializersInto(List<Initializer<?>> orderedInitializers, Class<? extends Initializer<?>> initializerClass) throws IllegalAccessException, InstantiationException {
        List<Initializer<?>> list = orderedInitializers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Initializer) it.next()).getClass() == initializerClass) {
                    return;
                }
            }
        }
        Initializer<?> initializerNewInstance = initializerClass.newInstance();
        Iterator<Class<? extends Initializer<?>>> it2 = initializerNewInstance.dependencies().iterator();
        while (it2.hasNext()) {
            orderInitializersInto(orderedInitializers, it2.next());
        }
        orderedInitializers.add(initializerNewInstance);
    }
}
