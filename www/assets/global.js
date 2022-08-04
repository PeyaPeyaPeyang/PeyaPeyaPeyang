const headerLoadListeners = [];

window.onHeaderLoad = (func) => {
    headerLoadListeners.push(func);
};

window.onload = () => {
    const header = "assets/header.htm";

    const header_container = document.getElementsByTagName("header");
    const header_container_0 = header_container[0];

    fetch(header)
        .then(response => response.text())
        .then(text => {
            header_container_0.innerHTML = text;
            setTimeout(() => {
                const counter = document.getElementById('counter');

                // if counter is loaded, adblock is not detected.

                if (counter.complete && counter.naturalHeight !== 0) {}
                else {
                    alert('AdBlockが検出されました。\n' +
                        'ユーザエクスペリエンスを向上させるために、AdBlockを解除してください。\n' +
                        '(アクセスカウンターが動きません！)\nキリ番が踏めなくなります！！！');
                }
            }, 1000);

            headerLoadListeners.forEach(func => func());
        })
        .catch(error => {
            console.log(error);
        })
}
document.oncontextmenu = () => {
    alert("右クリックは禁止です！");
    return false;
}
