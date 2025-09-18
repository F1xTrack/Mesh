package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class xo implements uo<Integer> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Integer num) {
        if (num == null || num.intValue() > 0) {
            return so.a(this);
        }
        return so.a(this, "Invalid quantity value " + num);
    }
}
