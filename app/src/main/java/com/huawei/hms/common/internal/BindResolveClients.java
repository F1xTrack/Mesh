package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class BindResolveClients {

    /* renamed from: b */
    private static final Object f18938b = new Object();

    /* renamed from: a */
    private ArrayList<ResolveClientBean> f18939a;

    /* renamed from: com.huawei.hms.common.internal.BindResolveClients$b */
    public static class C2067b {

        /* renamed from: a */
        private static final BindResolveClients f18940a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return C2067b.f18940a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (f18938b) {
            zContains = this.f18939a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (f18938b) {
            try {
                ListIterator<ResolveClientBean> listIterator = this.f18939a.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().clientReconnect();
                }
                this.f18939a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f18938b) {
            try {
                if (!this.f18939a.contains(resolveClientBean)) {
                    this.f18939a.add(resolveClientBean);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f18938b) {
            try {
                if (this.f18939a.contains(resolveClientBean)) {
                    ListIterator<ResolveClientBean> listIterator = this.f18939a.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        } else if (resolveClientBean.equals(listIterator.next())) {
                            listIterator.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f18938b) {
            this.f18939a.clear();
        }
    }

    private BindResolveClients() {
        this.f18939a = new ArrayList<>();
    }
}
