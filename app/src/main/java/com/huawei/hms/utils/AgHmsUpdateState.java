package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class AgHmsUpdateState {

    /* renamed from: c */
    private static final Object f19594c = new Object();

    /* renamed from: d */
    private static volatile AgHmsUpdateState f19595d;

    /* renamed from: a */
    private HmsCheckedState f19596a = HmsCheckedState.UNCHECKED;

    /* renamed from: b */
    private int f19597b = 0;

    private AgHmsUpdateState() {
    }

    public static AgHmsUpdateState getInstance() {
        if (f19595d == null) {
            synchronized (f19594c) {
                try {
                    if (f19595d == null) {
                        f19595d = new AgHmsUpdateState();
                    }
                } finally {
                }
            }
        }
        return f19595d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f19596a;
    }

    public int getTargetVersionCode() {
        return this.f19597b;
    }

    public boolean isUpdateHms() {
        return getCheckedState() == HmsCheckedState.NEED_UPDATE && this.f19597b != 0;
    }

    public void resetUpdateState() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE) {
            return;
        }
        setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        setTargetVersionCode(0);
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.m12620e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f19596a = hmsCheckedState;
        }
    }

    public void setTargetVersionCode(int i) {
        this.f19597b = i;
    }
}
