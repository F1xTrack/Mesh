package com.vk.push.core.remote.config.omicron.storage;

import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;

/* loaded from: classes2.dex */
public interface DataStorage {
    void clearData();

    Data getData(DataId dataId);

    void putData(DataId dataId, Data data);
}
