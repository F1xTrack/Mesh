package ru.ok.tracer.utils;

import defpackage.AbstractC8069xu;
import defpackage.C1518Tf1;
import defpackage.MN;
import defpackage.O90;
import defpackage.PS0;
import defpackage.RQ1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u00060\u0011R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ok/tracer/utils/SequentialExecutor;", "Ljava/util/concurrent/Executor;", "delegate", "<init>", "(Ljava/util/concurrent/Executor;)V", "LTf1;", "run", "()V", "Ljava/lang/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "atomicQueue", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/ok/tracer/utils/SequentialExecutor$QueueRunnable;", "queueRunnable", "Lru/ok/tracer/utils/SequentialExecutor$QueueRunnable;", "Companion", "QueueRunnable", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AtomicReference<List<Runnable>> atomicQueue;
    private final Executor delegate;
    private final QueueRunnable queueRunnable;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00062\u0006\u0010\b\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00062\u0006\u0010\b\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/utils/SequentialExecutor$Companion;", "", "()V", "pop", "", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "", "item", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "push", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> boolean pop(AtomicReference<List<T>> atomicReference, T t) {
            while (true) {
                List<T> list = atomicReference.get();
                if (list.get(0) != t) {
                    throw new IllegalStateException("Did someone mess with the queue?");
                }
                List<T> listW = AbstractC8069xu.w(list);
                while (!atomicReference.compareAndSet(list, listW)) {
                    if (atomicReference.get() != list) {
                        break;
                    }
                }
                return listW.isEmpty();
            }
        }

        public final <T> boolean push(AtomicReference<List<T>> atomicReference, T t) {
            while (true) {
                List<T> list = atomicReference.get();
                O90.e(list, "prev");
                ArrayList arrayListO = AbstractC8069xu.O(list, t);
                while (!atomicReference.compareAndSet(list, arrayListO)) {
                    if (atomicReference.get() != list) {
                        break;
                    }
                }
                return list.isEmpty();
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tracer/utils/SequentialExecutor$QueueRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lru/ok/tracer/utils/SequentialExecutor;)V", "LTf1;", "run", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class QueueRunnable implements Runnable {
        public QueueRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            SequentialExecutor.this.run();
        }
    }

    public SequentialExecutor(Executor executor) {
        O90.f(executor, "delegate");
        this.delegate = executor;
        this.atomicQueue = new AtomicReference<>(MN.a);
        this.queueRunnable = new QueueRunnable();
    }

    public final void run() throws Throwable {
        Object objB;
        boolean zPop;
        Throwable thA;
        do {
            List<Runnable> list = this.atomicQueue.get();
            O90.e(list, "atomicQueue.get()");
            Runnable runnable = (Runnable) AbstractC8069xu.C(list);
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
                objB = C1518Tf1.a;
            } catch (Throwable th) {
                objB = RQ1.b(th);
            }
            zPop = INSTANCE.pop(this.atomicQueue, runnable);
            thA = PS0.a(objB);
        } while (thA == null);
        if (!zPop) {
            this.delegate.execute(this.queueRunnable);
        }
        throw thA;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        O90.f(command, "command");
        if (INSTANCE.push(this.atomicQueue, command)) {
            this.delegate.execute(this.queueRunnable);
        }
    }
}
