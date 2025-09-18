package com.p019vk.push.core.remote.config.omicron.retriever;

import com.p019vk.push.core.remote.config.omicron.Data;
import com.p019vk.push.core.remote.config.omicron.DataId;

/* loaded from: classes2.dex */
public interface DataRetriever {
    Data getData();

    RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery);
}
