package com.takaharabooks.app.csinfo;

import com.takaharabooks.app.csinfo.ui.item.RssItem;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItemViewModel extends ViewModel {
    private MutableLiveData<List<RssItem>> RssItemList;

    public LiveData<List<RssItem>> getList() {
        if (RssItemList == null) {
            RssItemList = new MutableLiveData<List<RssItem>>();
            loadRssItemList();
        }
        return RssItemList;
    }
    public LiveData<List<RssItem>> getSelectedItem()
    {
        return RssItemList;
    }

    void loadRssItemList()
    {

    }
}