
def mode(arr):
    return mode_helper(arr, {})

def mode_helper(arr, mode):
    if len(arr) == 0:
        # lambda recursive function to lookup a max
        x = lambda a, m=None: m if a == [] else x(a[1:], a[0] if m is None or mode[a[0]] > mode[m] else m)
        return x([*mode])
    else:
        mode[arr[0]] = mode[arr[0]] + 1 if arr[0] in mode else 1
        return mode_helper(arr[1:], mode)

